package aula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {
	
	public static void main(String[] args) {
		List<String> Lista = new ArrayList<>();
		Lista.add("Branco");
		Lista.add("Branco");
		Lista.add("Preto");
		Lista.add("Amarelo");
		Lista.add("Azul");
		System.out.println(Lista);
		
		
		//Set<Integer> numeros = new HashSet<Integer>();
		//Set<Integer> numeros = new LinkedHashSet<Integer>();
		Set<Integer> numeros = new TreeSet<Integer>(); //coloca em ordem
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		System.out.println(numeros);
		
		
	}
}
