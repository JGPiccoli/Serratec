package testes;

import Banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 134;
		conta1.titular = "João";
		conta1.saldo = 2000.0;
		
		Conta conta2 = new Conta() ;
		conta2.numero = 321;
		conta2.titular = "B";
		conta2.saldo = 12345.0;
		conta2.deposito(100.);

		conta1.deposito(1000.);
		if (conta1.saque(500.)) {
			System.out.println(conta1.saldo);
		}
	}
}
