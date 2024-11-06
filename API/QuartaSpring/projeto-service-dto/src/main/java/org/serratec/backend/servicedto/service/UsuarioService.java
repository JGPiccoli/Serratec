package org.serratec.backend.servicedto.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.serratec.backend.servicedto.config.MailConfig;
import org.serratec.backend.servicedto.domain.Perfil;
import org.serratec.backend.servicedto.domain.Usuario;
import org.serratec.backend.servicedto.domain.UsuarioPerfil;
import org.serratec.backend.servicedto.dto.UsuarioDTO;
import org.serratec.backend.servicedto.dto.UsuarioInserirDTO;
import org.serratec.backend.servicedto.exception.EmailException;
import org.serratec.backend.servicedto.exception.SenhaException;
import org.serratec.backend.servicedto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PerfilService perfilService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private MailConfig mailConfig;

	public List<UsuarioDTO> findall() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = usuarios.stream().map(UsuarioDTO::new).toList();

		return usuariosDTO;
	}

	public Optional<Usuario> buscar(Long id) {
		return usuarioRepository.findById(id);
	}
	
	@Transactional
	public UsuarioDTO inserir(UsuarioInserirDTO usuarioInserirDTO) throws EmailException {
		if (!usuarioInserirDTO.getSenha().equals(usuarioInserirDTO.getConfirmaSenha())) {
			throw new SenhaException("Senha e Confirma Senha não são iguais");
		}
		if (usuarioRepository.findByEmail(usuarioInserirDTO.getEmail()) != null) {
			throw new EmailException("Email ja existente");
		}
		Usuario usuario = new Usuario();
		usuario.setNome(usuarioInserirDTO.getNome());
		usuario.setEmail(usuarioInserirDTO.getEmail());
		usuario.setSenha(encoder.encode(usuarioInserirDTO.getSenha()));
		
		Set<UsuarioPerfil> perfils = new HashSet<>();
		for (Perfil perfil : usuarioInserirDTO.getPerfis()) {
			perfil = perfilService.buscar(perfil.getId());
			UsuarioPerfil usuarioPerfil = new UsuarioPerfil(usuario, perfil, LocalDate.now());
			perfils.add(usuarioPerfil);
		}
		usuario.setUsuarioPerfis(perfils);
		
		usuario = usuarioRepository.save(usuario);
		
		mailConfig.sendEmail(usuario.getEmail(), "Cadastro de Usuario", usuario.toString());
		
		UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
		return usuarioDTO;
	}

}