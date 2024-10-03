package enumeradores;

import enumeradores.Funcionario.EstadoCivil;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Carla", EstadoCivil.CASADO);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getEstadoCivil());
		System.out.println(funcionario.getEstadoCivil().ordinal());
	}

}
