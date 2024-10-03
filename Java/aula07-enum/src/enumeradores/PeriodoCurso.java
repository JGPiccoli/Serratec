package enumeradores;

public enum PeriodoCurso {
	NOTURNO("ter e qua", 2500., 40), INTEGRAL("seg e sex", 1800., 20), TARDE("qui e sex", 3200., 80);

	private String dias;
	private Double valor;
	private Integer cargaHoraria;

	private PeriodoCurso(String dias, Double valor, Integer cargaHoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
