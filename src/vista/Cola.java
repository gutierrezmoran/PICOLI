package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Colores;
import utiles.Constantes;

public class Cola extends JPanel {
	
	public Cola() {
		this.setLayout(new GridLayout(1, Constantes.TAMANO_COLA, 0, 0));
	}
	
	public void agregarColor(Colores color, int posicion) {
		JLabel label = new JLabel();
		label.setBackground(color.getColor());
		label.setBorder(new EmptyBorder(3, 3, 3, 3));
		label.setFont(new Font("Arial", Font.PLAIN, 9));
		label.setOpaque(true);
		
		this.add(label);
	}

}
