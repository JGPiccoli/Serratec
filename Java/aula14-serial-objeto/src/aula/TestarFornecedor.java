package aula;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestarFornecedor {

	public static void main(String[] args) {
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		Fornecedor f1 = new Fornecedor("123", "ABC LTDA");
		Fornecedor f2 = new Fornecedor("321", "XPTO LTDA");
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		try {
			FileOutputStream FOS = new FileOutputStream("/curso/fornecedor.dat");
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);
			OOS.writeObject(fornecedores);
			OOS.flush();
			OOS.close();
			FOS.flush();
			FOS.close();
			System.out.println("Arquivo gravado com sucesso");
		} catch (Exception e) {
			System.err.println("Erro ao fazer a gravação do arquivo");
		}
	}
}