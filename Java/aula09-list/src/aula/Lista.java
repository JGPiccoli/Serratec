package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Matheus");
		nomes.add("Gabriela");
		//nomes.remove(0); remove item do indice indicado
		
		if (nomes.contains("Matheus")) {
			nomes.remove(nomes.indexOf("Matheus"));
		}
		System.out.println(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
			
		}

	}

}
