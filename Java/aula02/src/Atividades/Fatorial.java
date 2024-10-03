package Atividades;

public class Fatorial {
	public static void main(String[] args) {
		Integer n = 10;
		for (int i = 1; i <= n; i++) {
			fatorial(i);
			System.out.println("O fatorial de "+i+" é "+fatorial(i));
		}
	}

	public static Integer fatorial(Integer i) {
		if (i == 1 || i == 0) {
			return 1;
		}
		return i * fatorial(i - 1);
	}
}