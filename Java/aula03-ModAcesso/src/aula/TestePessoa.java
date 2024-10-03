package aula;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCodigo(123);
		p.setNome("João");
		p.setAltura(1.66);
		p.setPeso(70.);
		System.out.println("Resultado: " + p.resposta());
	}

}
