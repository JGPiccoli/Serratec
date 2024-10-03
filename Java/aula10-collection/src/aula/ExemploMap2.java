package aula;

import java.util.LinkedHashMap;

public class ExemploMap2 {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> mapas = new LinkedHashMap<Integer, String>();
		
		mapas.put(1, "Ana");
		mapas.put(2, "Carlos");
		mapas.put(3, "Igor");
		mapas.put(4, "Adriana");
		mapas.put(5, "Pedro");
		
		System.out.println(mapas);
	}
	
}
