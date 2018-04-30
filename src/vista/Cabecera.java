package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import utiles.Constantes;

public class Cabecera extends JPanel {
	
	public Cabecera() {
		crear();
	}
	
	public void crear() {
		setBackground(new Color(0, 128, 128));
		setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("PICOLI");
		lblNewLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setFont(Constantes.FUENTE_CABECERA.MyFont(0, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(lblNewLabel);
	}
}
