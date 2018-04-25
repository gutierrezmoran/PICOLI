package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import utiles.Constantes;

public class Lista extends JPanel {

	public Lista() {
		this.setLayout(new GridLayout(1, Constantes.TAMANO_LISTA_LADO, 0, 0));
	}
	public void agregarColor(Color color, int posicion) {
		JLabel label = new JLabel();
		label.setBackground(color);
		label.setBorder(new EmptyBorder(3, 3, 3, 3));
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		this.add(label);
	}

}
