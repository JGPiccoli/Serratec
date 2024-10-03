package atividade;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + produto + ", dataCompra: " + dataCompra + ", quantidade: " + quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += produto.getValor();
		
	}
	
	public void mostrarVenda() {
		
	}

}
