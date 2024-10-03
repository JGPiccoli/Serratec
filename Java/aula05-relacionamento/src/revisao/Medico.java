package revisao;

public class Medico extends PlanoSaude {
	protected String nomeMedico;
	protected String crm;

	public Medico(String nome, String nomeMedico, String crm) {
		super(nome);
		this.nomeMedico = nomeMedico;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return super.toString() + " Medico: " + nomeMedico;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
	}

}
