package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Maria", 98000.);
		Empresa empresa = new Empresa("ABC Ltda", 288500.);
		TotalTributos total = new TotalTributos();
		total.totalizarTributos(empresa);
		total.totalizarTributos(pessoa);
		
		System.out.println(pessoa.getNome()+" - "+pessoa.calcularIR());
		System.out.println(pessoa.getNome()+" - "+pessoa.calcularICMS());
		
		System.out.println(empresa.getRazaoSocial()+" - "+empresa.calcularIR());
		System.out.println(empresa.getRazaoSocial()+" - "+empresa.calcularICMS());
		
		System.out.println("Total Geral: " + total.getTotalGeral());
		
	}

}
