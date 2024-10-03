package atividade;

import java.time.LocalDate;

public class TesteVenda {
	
	public static void main(String[] args) {
		Produto p1 = new Produto(0001, "Tv", 3000., Categoria.ELETRONICO);
		Produto p2 = new Produto(1001, "Pneu", 800., Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(2001, "Celular", 2500., Categoria.ELETRONICO);
		Venda v1 = new Venda(p1, LocalDate.of(2024, 9, 9), 1);
		Venda v2 = new Venda(p2, LocalDate.of(2024, 9, 9), 1);
		Venda v3 = new Venda(p3, LocalDate.of(2024, 9, 9), 1);
		
		System.out.println("Valor dos items: \n------------------------");
		System.out.println(p1.getDescricao() + " - " + p1.getValor());
		v1.calcularVenda();
		System.out.println(p2.getDescricao() + " - " + p2.getValor());
		v2.calcularVenda();
		System.out.println(p3.getDescricao() + " - " + p3.getValor());
		v3.calcularVenda();
		
		System.out.println("------------------------ \nTotal dos items: " + Venda.getTotalVenda());
		
	}

}
