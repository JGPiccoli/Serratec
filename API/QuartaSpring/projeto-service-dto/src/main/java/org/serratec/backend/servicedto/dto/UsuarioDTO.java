package org.serratec.backend.servicedto.dto;

import java.util.HashSet;
import java.util.Set;

import org.serratec.backend.servicedto.domain.Perfil;
import org.serratec.backend.servicedto.domain.Usuario;
import org.serratec.backend.servicedto.domain.UsuarioPerfil;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	private Set<Perfil> perfils;

	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email, Set<Perfil> perfils) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.perfils = perfils;
	}

	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.perfils = new HashSet<>();
		for (UsuarioPerfil usuarioPerfil : usuario.getUsuarioPerfis()) {
			this.perfils.add(usuarioPerfil.getId().getPerfil());
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Perfil> getPerfils() {
		return perfils;
	}

	public void setPerfis(Set<Perfil> perfils) {
		this.perfils = perfils;
	}

}
