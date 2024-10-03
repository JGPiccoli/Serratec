package atividade2;

import javax.swing.JOptionPane;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");

		Atleta a1 = new Atleta("Anderson Silva", 98., pais1);
		Atleta a2 = new Atleta("Jon Jone", 59., pais2);
		Atleta a3 = new Atleta("Vitor Belford", 110., pais1);

		JOptionPane.showMessageDialog(null, "O atleta: " + a1.getNome() + "\n" + a1.verificaSituacao() + "\n");
		JOptionPane.showMessageDialog(null, "O atleta: " + a2.getNome() + "\n" + a2.verificaSituacao() + "\n");
		JOptionPane.showMessageDialog(null, "O atleta: " + a3.getNome() + "\n" + a3.verificaSituacao() + "\n");

		JOptionPane.showMessageDialog(null, "Total de Participantes: " + Atleta.getTotalParticipantes());

	}

}
