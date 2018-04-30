package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PaletaDeColores extends JPanel {

	private JPanel paleta;
	private JLabel labelPanelColores;

	public PaletaDeColores() {
		crear();
	}

	public void agregar(Color color) {
		assert color != null : "El color es nulo";

		JButton boton = new JButton();
		boton.setBackground(color);
		boton.setBorder(new LineBorder(new Color(70, 70, 70)));
		boton.setFocusPainted(false);
		boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		boton.setFont(new Font("Arial", Font.BOLD, 10));
		boton.setHorizontalAlignment(SwingConstants.CENTER);
		boton.setOpaque(true);

		this.paleta.add(boton);
	}

	public void crear() {
		setPreferredSize(new Dimension(400, 69));
		setOpaque(false);
		setBorder(null);
		setLayout(new BorderLayout(0, 0));

		labelPanelColores = new JLabel("SELECCIONAR UN COLOR");
		labelPanelColores.setForeground(Color.BLACK);
		labelPanelColores.setFont(new Font("Alef", Font.BOLD, 12));
		labelPanelColores.setBorder(new EmptyBorder(0, 0, 5, 0));
		labelPanelColores.setHorizontalAlignment(SwingConstants.LEFT);
		this.add(labelPanelColores, BorderLayout.NORTH);

		this.paleta = new JPanel();
		this.paleta.setOpaque(false);
		this.paleta.setBorder(null);
		this.paleta.setLayout(new GridLayout(1, 5, 5, 0));

		this.add(this.paleta, BorderLayout.CENTER);
	}

	public boolean buscar(Color color) {
		for (Component colorPaleta : this.paleta.getComponents()) {
			if (((JButton) colorPaleta).getBackground() == color) {
				return true;
			}
		}

		return false;
	}

	public JPanel getPaleta() {
		return paleta;
	}

	public JLabel getLabelPanelColores() {
		return labelPanelColores;
	}

}
