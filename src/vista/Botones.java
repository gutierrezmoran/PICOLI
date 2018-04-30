package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botones extends JPanel {

	private PaletaDeColores paleta;
	private Comodines comodines;

	public Botones() {
		crear();
	}

	public void crear() {
		setOpaque(false);
		setPreferredSize(new Dimension(10, 20));
		setLayout(new BorderLayout(0, 0));

		this.paleta = new PaletaDeColores();
		this.add(this.paleta, BorderLayout.WEST);

		this.comodines = new Comodines();
		this.add(this.comodines, BorderLayout.EAST);
	}

	public PaletaDeColores getPaletaDeColores() {
		return paleta;
	}

	public Comodines getComodines() {
		return comodines;
	}

	public JButton getBarajarPila() {
		return comodines.getBarajarPila();
	}

}
