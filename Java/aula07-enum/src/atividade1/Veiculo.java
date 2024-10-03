package atividade1;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Nome: " + proprietario + "Modelo: " + modelo;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	@Override
	public double LAVARVEICULO() {
		return 0;
	}

	@Override
	public double TROCAROLEO() {
		return 0;
	}

	@Override
	public double REVISAO() {
		return 0;
	}

}
