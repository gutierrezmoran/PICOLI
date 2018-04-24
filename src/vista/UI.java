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
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class UI extends JFrame {

	private JPanel contentPane;
	protected Cola cola;

	public UI() {
		setMinimumSize(new Dimension(800, 800));
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
		
		JPanel panelCola = new JPanel();
		panelCola.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelCola, BorderLayout.NORTH);
		panelCola.setLayout(new BorderLayout(0, 0));

		this.cola = new Cola();
		cola.setBackground(Color.BLACK);
		GridLayout gridLayout = (GridLayout) cola.getLayout();
		gridLayout.setHgap(2);
		panelCola.add(cola, BorderLayout.CENTER);
		cola.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cola.setPreferredSize(new Dimension(10, 80));
		cola.setMinimumSize(new Dimension(10, 80));
		
		JPanel panelCabeceraCola = new JPanel();
		panelCola.add(panelCabeceraCola, BorderLayout.NORTH);
		panelCabeceraCola.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Cola");
		panelCabeceraCola.add(lblNewLabel_1, BorderLayout.NORTH);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 18));
		
		JPanel panelPieCola = new JPanel();
		panelPieCola.setBorder(null);
		panelCola.add(panelPieCola, BorderLayout.SOUTH);
		panelPieCola.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Salida");
		panelPieCola.add(lblNewLabel_2, BorderLayout.WEST);
		lblNewLabel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel lblNewLabel_3 = new JLabel("Entrada");
		panelPieCola.add(lblNewLabel_3, BorderLayout.EAST);
		lblNewLabel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panelPrincipal.add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPila_1 = new JPanel();
		panel.add(panelPila_1, BorderLayout.NORTH);
		
		Pila pila_1= new Pila();
		panelPila_1.add(pila_1);
		
		JPanel lista_2 = new JPanel();
		panel.add(lista_2, BorderLayout.SOUTH);
		
		JLabel lblAquiLaLista = new JLabel("aqui la lista");
		lblAquiLaLista.setBackground(Color.WHITE);
		lblAquiLaLista.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblAquiLaLista, BorderLayout.CENTER);
		
		JPanel panelInferior = new JPanel();
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelInferior.add(panelBotones);
		
		JPanel panelMonedas = new JPanel();
		panelInferior.add(panelMonedas, BorderLayout.WEST);
		panelMonedas.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		panelMonedas.add(label, BorderLayout.NORTH);
	}

}
