package vista;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Comodines extends JPanel {

	private JPanel panelIconos;
	private JButton borrarColor;
	private JLabel labelBorrarColor;
	private JLabel labelPedirColor;
	private JLabel labelBarajarPila;
	private JButton pedirColor;
	private JButton barajarPila;

	public Comodines() {
		crear();
	}

	public void crear() {
		setOpaque(false);
		setLayout(new BorderLayout(0, 0));

		crearPanelIconos();
		crearBotonBorrarColor();
		crearBotonPedirColor();
		crearBotonBarajarPilas();
		crearPanelCantidadesUso();
	}

	private void crearPanelIconos() {
		this.panelIconos = new JPanel();
		panelIconos.setOpaque(false);
		panelIconos.setLayout(new GridLayout(0, 3, 20, 0));
		this.add(panelIconos, BorderLayout.NORTH);
	}

	private void crearBotonBorrarColor() {
		this.borrarColor = new JButton("");
		this.borrarColor.setName("SELECCIONAR UN COLOR PARA BORRAR DE LA LISTA");
		this.borrarColor.setContentAreaFilled(false);
		this.borrarColor.setToolTipText(
				"Permite elegir un color que eliminar\u00E1 todos aquellos iguales que se encuentren en la lista");
		this.borrarColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.borrarColor.setBorderPainted(false);
		this.borrarColor.setOpaque(false);
		this.borrarColor.setIcon(new ImageIcon(UI.class.getResource("/assets/goma.png")));
		this.borrarColor.setBorder(null);
		this.borrarColor.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.borrarColor.setFocusPainted(false);
		this.panelIconos.add(borrarColor);
	}

	private void crearBotonPedirColor() {
		this.pedirColor = new JButton("");
		this.pedirColor.setToolTipText("Permite seleccionar un color de los 5 disponibles");
		this.pedirColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.pedirColor.setContentAreaFilled(false);
		this.pedirColor.setBorderPainted(false);
		this.pedirColor.setBorder(null);
		this.pedirColor.setOpaque(false);
		this.pedirColor.setIcon(new ImageIcon(UI.class.getResource("/assets/paleta.png")));
		this.pedirColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		this.pedirColor.setFocusPainted(false);
		panelIconos.add(pedirColor);
	}

	private void crearBotonBarajarPilas() {
		this.barajarPila = new JButton("");
		this.barajarPila.setToolTipText("Baraja las pilas alterando su orden actual y equilibr\u00E1ndolas");
		this.barajarPila.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.barajarPila.setContentAreaFilled(false);
		this.barajarPila.setBorderPainted(false);
		this.barajarPila.setOpaque(false);
		this.barajarPila.setBorder(null);
		this.barajarPila.setIcon(new ImageIcon(UI.class.getResource("/assets/barajar.png")));
		this.barajarPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		this.barajarPila.setFocusPainted(false);
		panelIconos.add(barajarPila);
	}

	private void crearPanelCantidadesUso() {
		JPanel panelCantidadesUso = new JPanel();
		panelCantidadesUso.setOpaque(false);
		panelCantidadesUso.setLayout(new GridLayout(0, 3, 20, 0));
		this.add(panelCantidadesUso, BorderLayout.SOUTH);

		labelBorrarColor = new JLabel("0");
		labelBorrarColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelBorrarColor);

		labelPedirColor = new JLabel("0");
		labelPedirColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelPedirColor);

		labelBarajarPila = new JLabel("0");
		labelBarajarPila.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelBarajarPila);
	}

	public JButton getBorrarColor() {
		return borrarColor;
	}

	public JPanel getPanelIconos() {
		return panelIconos;
	}

	public JLabel getLabelBorrarColor() {
		return labelBorrarColor;
	}

	public JLabel getLabelPedirColor() {
		return labelPedirColor;
	}

	public JLabel getLabelBarajarPila() {
		return labelBarajarPila;
	}

	public JButton getPedirColor() {
		return pedirColor;
	}

	public JButton getBarajarPila() {
		return barajarPila;
	}

}
