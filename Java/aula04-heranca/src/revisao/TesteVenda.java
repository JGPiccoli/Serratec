package revisao;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		
		//instanciar
		Venda v1 = new Venda(1, LocalDate.of(2024, 9, 1), 2, 50.0, 0.0);
		Venda v2 = new Venda(2, LocalDate.now(), 5, 21.8, 0.0);
		
		//usar instancia
		v1.finalizarVenda();
		v2.finalizarVenda();
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}
}