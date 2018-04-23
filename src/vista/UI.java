package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Dimension;

public class UI extends JFrame {

	private JPanel contentPane;

	public UI() {
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTituloJuego = new JPanel();
		panelTituloJuego.setBackground(new Color(0, 128, 128));
		contentPane.add(panelTituloJuego, BorderLayout.NORTH);
		panelTituloJuego.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PICOLI");
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTituloJuego.add(lblNewLabel);
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAquiElPanel = new JLabel("aqui el panel de la cola");
		lblAquiElPanel.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblAquiElPanel, BorderLayout.NORTH);
		
		JLabel lblAquiLosPaneles = new JLabel("Aqui los paneles de las pilas");
		panelPrincipal.add(lblAquiLosPaneles, BorderLayout.WEST);
		
		JLabel lblAquiLaLista = new JLabel("aqui la lista");
		lblAquiLaLista.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblAquiLaLista, BorderLayout.CENTER);
		
		JLabel lblAquiMensajeY = new JLabel("aqui mensaje y las moneda");
		lblAquiMensajeY.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblAquiMensajeY, BorderLayout.SOUTH);
	}

}
