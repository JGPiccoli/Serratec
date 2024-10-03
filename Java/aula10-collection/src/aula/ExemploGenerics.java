package aula;

public class ExemploGenerics<T> {
	private T valor;

	public ExemploGenerics(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

}
