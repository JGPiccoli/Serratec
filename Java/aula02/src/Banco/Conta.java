package Banco;

public class Conta {
	public Integer numero;
	public String titular;
	public Double saldo;

	public void deposito(Double valor) {
		if (saldo <= 0) {
			System.out.println("Não pode depositar");
		} else {
			saldo += valor;
			System.out.println("Depositado com sucesso " + saldo);
		}
	}

	public boolean saque(Double valor) {
		if (saldo < valor) {
			System.out.println("Saldo invalido");
			return false;
		} else {
			saldo -= valor;
			System.out.println("Saque com sucesso " + saldo);
			return true;
		}
	}

}
