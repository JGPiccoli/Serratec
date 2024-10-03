package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {
		// Polimorfismo - um objeto pode ser referenciado de varias formas
		Veiculo v1 = new Moto("LVC9090", "Cinza", 39000., true);
		Veiculo v2 = new Caminhao("ABC1234", "Branco", 110000., 100000);
		
		
		System.out.println(v1);
		System.out.println("Valor IPVA: " + v1.calcularIpva());
		System.out.println(v2);
		System.out.println("Valor IPVA: " + v2.calcularIpva());
	}

}
