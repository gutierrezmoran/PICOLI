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

	private JPanel lista;

	public Lista() {
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

		this.lista.add(label);
	}

	public void crear() {
		setOpaque(false);
		setBorder(new EmptyBorder(5, 20, 10, 20));
		setLayout(new BorderLayout(0, 0));

		this.lista = new JPanel();
		this.lista.setBackground(Constantes.BACKGROUND_PANELES);
		this.lista.setLayout(new GridLayout(Constantes.TAMANO_LISTA_LADO - 1, 1, 2, 0));
		this.add(this.lista);

		JLabel lblLista = new JLabel("LISTA");
		lblLista.setForeground(Color.BLACK);
		lblLista.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblLista.setHorizontalAlignment(SwingConstants.LEFT);
		lblLista.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		this.add(lblLista, BorderLayout.NORTH);
	}

	public JPanel getLista() {
		return lista;
	}

}
