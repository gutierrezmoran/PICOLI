package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import modelo.Colores;
import utiles.Constantes;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Cursor;


public class Menu extends JPanel {

	private JButton reiniciar;
	private JPanel panelCentral;
	private JPanel panelBotonReiniciar;

	public Menu(boolean estado) {
		crear(estado);
	}

	public void crear(boolean estado) {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setBorder(new EmptyBorder(60, 0, 0, 0));
		setOpaque(false);
		crearPanelCentral();

		if (estado) {
			crearVictoria();
		} else {
			crearDerrota();
		}
	}

	private void crearPanelCentral() {
		this.panelCentral = new JPanel();
		this.panelCentral.setOpaque(false);
		this.panelCentral.setPreferredSize(new Dimension(800, 260));
		this.panelCentral.setLayout(new BorderLayout(0, 0));
		add(this.panelCentral);

		crearBotonReiniciar();
		crearPanelBotonReiniciar();
	}

	private void crearVictoria() {
		JLabel mensajePartida = new JLabel("PICOLI GANA");
		mensajePartida.setFont(Constantes.FUENTE_CABECERA.MyFont(1, 45));
		mensajePartida.setForeground(new Color(11, 186, 125));
		mensajePartida.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelCentral.add(mensajePartida, BorderLayout.NORTH);
	}

	private void crearDerrota() {
		JLabel mensajePartida = new JLabel("PICOLI PIERDE");
		mensajePartida.setFont(Constantes.FUENTE_CABECERA.MyFont(1, 45));
		mensajePartida.setForeground(new Color(209, 14, 14));
		mensajePartida.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelCentral.add(mensajePartida, BorderLayout.NORTH);
	}

	private void crearBotonReiniciar() {
		this.reiniciar = new JButton("Reiniciar");
		this.reiniciar.setBorder(new LineBorder(new Color(106, 146, 242), 1));
		this.reiniciar.setBackground(new Color(39, 201, 255));
		this.reiniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.reiniciar.setForeground(new Color(255, 226, 70));
		this.reiniciar.setFont(Constantes.FUENTE_CABECERA.MyFont(0, 20));
		this.reiniciar.setPreferredSize(new Dimension(10, 50));
		this.reiniciar.setMinimumSize(new Dimension(10, 10));
		this.reiniciar.setFocusPainted(false);
	}

	private void crearPanelBotonReiniciar() {
		this.panelBotonReiniciar = new JPanel();
		this.panelBotonReiniciar.setOpaque(false);
		this.panelCentral.add(this.panelBotonReiniciar, BorderLayout.SOUTH);

		GroupLayout gl_panelReiniciar = new GroupLayout(this.panelBotonReiniciar);
		gl_panelReiniciar.setHorizontalGroup(
			gl_panelReiniciar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReiniciar.createSequentialGroup()
					.addGap(200)
					.addComponent(reiniciar, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addGap(200))
		);
		gl_panelReiniciar.setVerticalGroup(
			gl_panelReiniciar.createParallelGroup(Alignment.TRAILING)
				.addComponent(reiniciar, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
		);

		this.panelBotonReiniciar.setLayout(gl_panelReiniciar);
	}

	public JButton getReiniciar() {
		return reiniciar;
	}

}
