package enumeradores;

public class EscolaMunicipal extends Escola {
	private final String SEGMENTO;

	public EscolaMunicipal(String cnpj, String razaoSocial, String SEGMENTO) {
		super(cnpj, razaoSocial);
		this.SEGMENTO = SEGMENTO;
	}
	
	
	public static void main(String[] args) {
		EscolaMunicipal em = new EscolaMunicipal("123", "Liceu", "Fundamental");
	}
}
