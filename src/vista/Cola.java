package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Cola extends JPanel {
	
	private JPanel cola;
	
	public Cola() {
		crear();
	}
	
	public void agregar(Color color) {
		assert color != null : "El color es nulo";
		
		JLabel label = new JLabel();
		label.setBackground(color);
		label.setBorder(new LineBorder(new Color(109, 109, 109)));
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		this.cola.add(label);
	}
	
	public void crear() {
		setLayout(new BorderLayout(0, 0));
		setOpaque(false);
		setBorder(new EmptyBorder(10, 20, 5, 20));
		GridLayout gl_cola = new GridLayout(1, 10);
		gl_cola.setHgap(5);

		this.cola = new JPanel();
		this.cola.setOpaque(false);
		this.cola.setLayout(gl_cola);
		this.cola.setPreferredSize(new Dimension(10, 80));
		this.cola.setMinimumSize(new Dimension(10, 80));
		this.add(cola, BorderLayout.CENTER);

		JPanel panelCabeceraCola = new JPanel();
		panelCabeceraCola.setOpaque(false);
		panelCabeceraCola.setLayout(new BorderLayout(0, 0));
		this.add(panelCabeceraCola, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel("COLA");
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		panelCabeceraCola.add(lblNewLabel_1, BorderLayout.NORTH);

		JPanel panelPieCola = new JPanel();
		panelPieCola.setOpaque(false);
		panelPieCola.setBorder(null);
		panelPieCola.setLayout(new BorderLayout(0, 0));
		this.add(panelPieCola, BorderLayout.SOUTH);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UI.class.getResource("/assets/rojaAbajo.png")));
		lblNewLabel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panelPieCola.add(lblNewLabel_2, BorderLayout.WEST);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UI.class.getResource("/assets/verdeIzquierda.png")));
		lblNewLabel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panelPieCola.add(lblNewLabel_3, BorderLayout.EAST);
	}

	public JPanel getCola() {
		return cola;
	}

}
