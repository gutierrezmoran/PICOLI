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
		JButton borrarColor = new JButton("");
		borrarColor.setContentAreaFilled(false);
		borrarColor.setToolTipText(
				"Permite elegir un color que eliminar\u00E1 todos aquellos iguales que se encuentren en la lista");
		borrarColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		borrarColor.setBorderPainted(false);
		borrarColor.setOpaque(false);
		borrarColor.setIcon(new ImageIcon(UI.class.getResource("/assets/goma.png")));
		borrarColor.setBorder(null);
		borrarColor.setFont(new Font("Tahoma", Font.BOLD, 20));
		borrarColor.setFocusPainted(false);
		this.panelIconos.add(borrarColor);
	}

	private void crearBotonPedirColor() {
		JButton pedirColor = new JButton("");
		pedirColor.setToolTipText("Permite seleccionar un color de los 5 disponibles");
		pedirColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pedirColor.setContentAreaFilled(false);
		pedirColor.setBorderPainted(false);
		pedirColor.setBorder(null);
		pedirColor.setOpaque(false);
		pedirColor.setIcon(new ImageIcon(UI.class.getResource("/assets/paleta.png")));
		pedirColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pedirColor.setFocusPainted(false);
		panelIconos.add(pedirColor);
	}

	private void crearBotonBarajarPilas() {
		JButton barajarPila = new JButton("");
		barajarPila.setToolTipText("Baraja las pilas alterando su orden actual y equilibr\u00E1ndolas");
		barajarPila.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		barajarPila.setContentAreaFilled(false);
		barajarPila.setBorderPainted(false);
		barajarPila.setOpaque(false);
		barajarPila.setBorder(null);
		barajarPila.setIcon(new ImageIcon(UI.class.getResource("/assets/barajar.png")));
		barajarPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		barajarPila.setFocusPainted(false);
		panelIconos.add(barajarPila);
	}

	private void crearPanelCantidadesUso() {
		JPanel panelCantidadesUso = new JPanel();
		panelCantidadesUso.setOpaque(false);
		panelCantidadesUso.setLayout(new GridLayout(0, 3, 20, 0));
		this.add(panelCantidadesUso, BorderLayout.SOUTH);

		JLabel labelBorrarColor = new JLabel("0");
		labelBorrarColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelBorrarColor);

		JLabel labelPedirColor = new JLabel("0");
		labelPedirColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelPedirColor);

		JLabel labelBarajarPila = new JLabel("0");
		labelBarajarPila.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidadesUso.add(labelBarajarPila);
	}
}
