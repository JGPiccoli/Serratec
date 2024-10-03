package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLista {

	public static void main(String[] args) {
		List<String> bichos = Arrays.asList("Cachoro", "Gato", "Coelho", "Pato");

		bichos.add("Rato");
		Collections.sort(bichos);
		System.out.println(bichos);

	}

}
