package atividade1;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;
	double valorCobrado;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
		this.valorCobrado = 0.;
	}

	public double LAVARVEICULO() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	public double TROCAROLEO() {
		return TipoServico.OLEO.getValorPorServico();
	}

	public double REVISAO() {
		return TipoServico.REVISAO.getValorPorServico();
	}
}
