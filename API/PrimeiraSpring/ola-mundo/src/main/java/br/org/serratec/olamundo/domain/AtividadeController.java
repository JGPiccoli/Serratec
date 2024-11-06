package br.org.serratec.olamundo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/veiculos")
public class AtividadeController {
	
	private static List<atividade> lista = new ArrayList<atividade>();
	
	@GetMapping
	public List<atividade> listar() {
		return lista;
	}
	
	@GetMapping("/{id}")
	public atividade buscar(@PathVariable Long id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId().equals(id)) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	@PostMapping
	public atividade inserir(@RequestBody atividade atividade) {
		lista.add(atividade);
		return atividade;
	}
	
	@PutMapping("/{id}")
	public atividade atualizar(@PathVariable Long id, @RequestBody atividade atividade) {
		for (int i = 0; i > lista.size(); i++) {
			if (lista.get(i).getId().equals(id)) {
				atividade a = new atividade(id, null, null);
				lista.set(i, a);
				return a;
			}
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		for (int i = 0; i > lista.size(); i++) {
			if (lista.get(i).getId().equals(id)) {
				lista.remove(i);
				break;
			}
		}
	}
	

}
