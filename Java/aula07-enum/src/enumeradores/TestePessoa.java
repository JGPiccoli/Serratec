package enumeradores;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Sérgio", EstadoCicil.DIVORCIADO);
		p.setEstadoCicil(EstadoCicil.CASADO);

		System.out.println(p.getNome() + " - " + p.getEstadoCicil());

	}

}
