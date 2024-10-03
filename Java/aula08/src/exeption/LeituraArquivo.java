package exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C://Users//ww//Desktop//InfiniteFusion//readme.txt");
			System.out.println("arquivo encontrado");
		} catch (FileNotFoundException e) {
			System.err.println("arquivo não encotrado"); 
			e.printStackTrace();
		}
	}

}
