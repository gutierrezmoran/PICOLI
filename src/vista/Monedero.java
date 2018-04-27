package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Monedero extends JPanel {
	
	private JLabel monedas;
	
	public Monedero() {
		crear();
	}

	public void crear() {
		setOpaque(false);
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(5, 0));

		JLabel moneda = new JLabel("");
		moneda.setIcon(new ImageIcon(UI.class.getResource("/assets/coin.gif")));
		this.add(moneda, BorderLayout.WEST);

		this.monedas = new JLabel("0");
		this.monedas.setFont(new Font("Tahoma", Font.BOLD, 23));
		this.add(monedas, BorderLayout.EAST);
	}

	public JLabel getMonedas() {
		return monedas;
	}

}
