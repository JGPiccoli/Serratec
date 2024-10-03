package aula;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		//Set- é uma interface
		//HashSet- não aceita elementos duplicados
		
		Set<String> lista = new TreeSet<>();
		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("Botafogo");
		lista.add("Botafogo");
		lista.add("Fluminense");
		
		System.out.println(lista);
	}

}
