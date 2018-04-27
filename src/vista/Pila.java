package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javafx.scene.layout.Border;
import utiles.Constantes;

public class Pila extends JPanel {
	
	private JPanel pila;

	public Pila() {
		crear();
	}

	public void agregar(Color color) {
		assert color != null : "El color es nulo";
		
		JLabel label = new JLabel();
		label.setBackground(color);
		label.setBorder(new EmptyBorder(3, 3, 3, 3));
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		this.pila.add(label);
	}
	
	public void crear() {
		setBorder(null);
		setPreferredSize(new Dimension(60, 10));
		setLayout(new BorderLayout(0, 0));
		setOpaque(false);

		this.pila = new JPanel();
		this.pila.setBorder(null);
		this.pila.setBackground(Constantes.BACKGROUND_PANELES);
		this.pila.setLayout(new GridLayout(Constantes.TAMANO_PILA, 1, 0, 0));
		this.add(this.pila);
	}

	public JPanel getPila() {
		return pila;
	}

}
