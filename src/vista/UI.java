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
import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;
	protected Cola cola;

	public UI() {
		setMinimumSize(new Dimension(700, 600));
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
		
		JLabel lblNewLabel_1 = new JLabel("COLA");
		panelCabeceraCola.add(lblNewLabel_1, BorderLayout.NORTH);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 14));
		
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
		
		JPanel panelPilas = new JPanel();
		panelPilas.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelPilas, BorderLayout.WEST);
		panelPilas.setLayout(new BorderLayout(5, 0));
		
		JPanel panelPila_1 = new JPanel();
		panelPila_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelPila_1.setPreferredSize(new Dimension(60, 10));
		panelPila_1.setMinimumSize(new Dimension(30, 10));
		panelPila_1.setBackground(Color.WHITE);
		panelPilas.add(panelPila_1, BorderLayout.WEST);
		panelPila_1.setLayout(new BorderLayout(0, 0));
		
		Pila pila_1= new Pila();
		panelPila_1.add(pila_1, BorderLayout.CENTER);
		
		JPanel panelPila_2 = new JPanel();
		panelPila_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelPila_2.setPreferredSize(new Dimension(60, 10));
		panelPila_2.setBackground(Color.WHITE);
		panelPilas.add(panelPila_2, BorderLayout.EAST);
		
		Pila pila_2= new Pila();
		panelPila_2.add(pila_2);
		
		JLabel label = new JLabel("");
		panelPila_2.add(label);
		
		JLabel lblPilas = new JLabel("PILAS");
		lblPilas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilas.setFont(new Font("Gadugi", Font.BOLD, 14));
		panelPilas.add(lblPilas, BorderLayout.NORTH);
		
		JLabel lblPila = new JLabel("         1                     2");
		lblPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPila.setHorizontalAlignment(SwingConstants.LEFT);
		panelPilas.add(lblPila, BorderLayout.SOUTH);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setLayout(new BorderLayout(50, 0));
		
		JPanel panelBotones = new JPanel();
		panelInferior.add(panelBotones);
		panelBotones.setLayout(new GridLayout(0, 4, 5, 0));
		
		JButton borrarColor = new JButton("Borrar Color");
		borrarColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		borrarColor.setFocusPainted(false);
		borrarColor.setBackground(Color.WHITE);
		panelBotones.add(borrarColor);
		
		JButton pedirColor = new JButton("Pedir Color");
		pedirColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pedirColor.setFocusPainted(false);
		pedirColor.setBackground(Color.WHITE);
		panelBotones.add(pedirColor);
		
		JButton barajarPila = new JButton("Barajar Pila");
		barajarPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		barajarPila.setFocusPainted(false);
		barajarPila.setBackground(Color.WHITE);
		panelBotones.add(barajarPila);
		
		JButton seleccionarColor = new JButton("Seleccionar Color");
		seleccionarColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		seleccionarColor.setFocusPainted(false);
		seleccionarColor.setBackground(Color.WHITE);
		panelBotones.add(seleccionarColor);
		
		JPanel panelMonedas = new JPanel();
		panelInferior.add(panelMonedas, BorderLayout.WEST);
		panelMonedas.setLayout(new BorderLayout(5, 0));
		
		JLabel moneda = new JLabel("");
		moneda.setIcon(new ImageIcon(UI.class.getResource("/assets/coin.gif")));
		panelMonedas.add(moneda, BorderLayout.WEST);
		
		JLabel cantidadMonedas = new JLabel("5");
		cantidadMonedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelMonedas.add(cantidadMonedas, BorderLayout.EAST);
		
		
		Lista lista = new Lista();
		lista.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lista.setBackground(Color.white);
		
		
		JPanel panelLista = new JPanel();
		panelLista.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelLista, BorderLayout.CENTER);
		panelLista.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLista = new JLabel("LISTA");
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setFont(new Font("Gadugi", Font.BOLD, 14));
		panelLista.add(lblLista, BorderLayout.NORTH);
		panelLista.add(lista);
	}

}
