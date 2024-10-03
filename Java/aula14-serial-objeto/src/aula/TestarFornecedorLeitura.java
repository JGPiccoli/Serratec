package aula;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestarFornecedorLeitura {

	public static void main(String[] args) {
		System.out.println("Leitura dos Objetos");
		List<Fornecedor> fornecedores = new ArrayList<>();
		try {
			FileInputStream FIS = new FileInputStream("/curso/fornecedor.dat");
			ObjectInputStream OIS = new ObjectInputStream(FIS);
			fornecedores = (ArrayList<Fornecedor>) OIS.readObject();
			OIS.close();
			FIS.close();
			System.out.println(fornecedores);
		} catch (Exception e) {
			System.err.println("Erro");
		}

	}

}
