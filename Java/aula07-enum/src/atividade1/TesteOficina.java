package atividade1;

import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Ana");
		Carro c1 = new Carro(p1, "SW4", LocalDate.of(2024, 9, 6), "SUV");
		
		
		System.out.println("O valor da troca de oleo é: " + c1.TROCAROLEO());
		System.out.println("O valor da revisao é: " + c1.REVISAO());
		System.out.println(c1 + ", Valor Cobrado: " + c1.valorCobrado);
	}

}
