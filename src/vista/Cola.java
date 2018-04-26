package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import utiles.Constantes;

public class Cola extends JPanel {
	
	public Cola() {
		this.setLayout(new GridLayout(1, Constantes.TAMANO_COLA, 0, 0));
	}
	
	public void agregarColor(Color color) {
		JLabel label = new JLabel();
		label.setBackground(color);
		label.setBorder(new LineBorder(new Color(109, 109, 109)));
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		this.add(label);
	}

}
