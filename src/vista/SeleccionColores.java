package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SeleccionColores extends JPanel {
	
	public void agregar(Color color) {
		JButton boton = new JButton();
		boton.setBackground(color);
		boton.setBorder(new EmptyBorder(3, 3, 3, 3));
		boton.setFocusPainted(false);
		boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		boton.setFont(new Font("Arial", Font.BOLD, 10));
		boton.setHorizontalAlignment(SwingConstants.CENTER);
		boton.setOpaque(true);
		
		this.add(boton);
	}

}
