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
		JPanel panel = new JPanel();
		panel.setBackground(color.getColor());
		panel.setLayout(new BorderLayout(0, 0));
		panel.setName(String.valueOf((posicion + 1)));
		
		JLabel label = new JLabel(String.valueOf(panel.getName()));
		label.setBorder(new EmptyBorder(3, 3, 3, 3));
		label.setFont(new Font("Arial", Font.PLAIN, 9));
		panel.add(label, BorderLayout.NORTH);
		
		this.add(panel);
	}

}
