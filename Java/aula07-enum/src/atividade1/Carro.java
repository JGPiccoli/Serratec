package atividade1;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;
	double valorCobrado;

	public Carro(Proprietario proprietario, String modelo, LocalDate dataConserto, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
		this.valorCobrado = 0.;
	}

	@Override
	public String toString() {
		return proprietario + ", Modelo: " + modelo + ", Categoria: " + categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public double LAVARVEICULO() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	public double TROCAROLEO() {
		double valorTrocaOleo = TipoServico.OLEO.getValorPorServico();
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valorTrocaOleo -= 50.;
		}
		valorCobrado += valorTrocaOleo;
		return valorTrocaOleo;
	}

	public double REVISAO() {
		double valorRevisao = TipoServico.REVISAO.getValorPorServico();
		if (dataConserto.getMonth().getValue() == 8) {
			valorRevisao *= 0.90;
		}
		valorCobrado += valorRevisao;
		return valorRevisao;
	}
}
