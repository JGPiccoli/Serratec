package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExemploSuperExtends {
	
	public static void main(String[] args) {
		List<Integer> ListaNumeros = Arrays.asList(10,20,30,9,50);
		List<String> ListaStrings = Arrays.asList("Sansung", "Apple", "LG");
		List<Object> ListaObjetos = new ArrayList<Object>();
		
		//imprimirListas(ListaNumeros);
		//imprimirListas(ListaStrings);
		
		copiarListas(ListaNumeros, ListaObjetos);
		imprimirListas(ListaObjetos);
	}
	
	public static void imprimirListas(List<?> Lista) {
		for (Object o : Lista) {
			System.out.println(o);
		}
		
	}
	
	
	public static void copiarListas(List<? extends Number> origem,List<? super Number> destino) {
		for (Number numero : origem) {
			destino.add(numero);
		}
		
		
		
	}

}
