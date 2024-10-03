package revisao;

import java.time.LocalDate;

public class Cachoro extends Mamifero implements AnimalDomestico {
	private boolean Castrado;

	public Cachoro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		Castrado = castrado;
	}

	@Override
	public boolean levarVeterinari() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
