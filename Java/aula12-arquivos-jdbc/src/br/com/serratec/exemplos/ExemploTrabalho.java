package br.com.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExemploTrabalho {

	public static void main(String[] args) {

		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = ler.next();
			Scanner sc = new Scanner(new File(nomeArquivo));
			List<Empregado> empregados = new ArrayList<>();
			while (sc.hasNext()) {
				String Linha = sc.nextLine();
				if (!Linha.isEmpty())
					;
				String[] dadosDaLinha = Linha.split(";");
				String nome = dadosDaLinha[0];
				String profissao = dadosDaLinha[1];
				empregados.add(new Empregado(nome, profissao));
			}
			sc.close();

			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("\\curso\\empregadossaida.csv"));
				for (Empregado empregado : empregados) {
					bw.append(empregado.getNome() + " - " + empregado.getProfissao() + "\n");
				}
				bw.close();
				System.out.println("Arquivo Gravado!!");
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Errou !");
		}

	}

}
