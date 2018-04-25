package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class UI extends JFrame {

	private JPanel contentPane;
	protected Cola cola;
	protected Pila pilaUno;
	protected Pila pilaDos;
	protected Lista lista;
	protected SeleccionColores panelColores;
	protected JLabel cantidadMonedas;

	public UI() {
		setTitle("PICOLI");
		setMinimumSize(new Dimension(1000, 600));
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
		panelCola.setBorder(new EmptyBorder(10, 20, 5, 20));
		panelPrincipal.add(panelCola, BorderLayout.NORTH);
		panelCola.setLayout(new BorderLayout(0, 0));

		this.cola = new Cola();
		GridLayout gridLayout = (GridLayout) cola.getLayout();
		gridLayout.setHgap(5);
		panelCola.add(cola, BorderLayout.CENTER);
		cola.setPreferredSize(new Dimension(10, 80));
		cola.setMinimumSize(new Dimension(10, 80));
		
		JPanel panelCabeceraCola = new JPanel();
		panelCola.add(panelCabeceraCola, BorderLayout.NORTH);
		panelCabeceraCola.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("COLA");
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 5, 0));
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
		panelPilas.setBorder(new EmptyBorder(5, 20, 10, 20));
		panelPrincipal.add(panelPilas, BorderLayout.WEST);
		panelPilas.setLayout(new BorderLayout(5, 0));
		
		JPanel panelPila_1 = new JPanel();
		panelPila_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPila_1.setPreferredSize(new Dimension(60, 10));
		panelPila_1.setMinimumSize(new Dimension(30, 10));
		panelPila_1.setBackground(Color.WHITE);
		panelPilas.add(panelPila_1, BorderLayout.WEST);
		panelPila_1.setLayout(new BorderLayout(0, 0));
		
		pilaUno= new Pila();
		pilaUno.setBorder(null);
		pilaUno.setBackground(Color.WHITE);
		panelPila_1.add(pilaUno);
		
		JPanel panelPila_2 = new JPanel();
		panelPila_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPila_2.setPreferredSize(new Dimension(60, 10));
		panelPila_2.setBackground(Color.WHITE);
		panelPilas.add(panelPila_2, BorderLayout.EAST);
		panelPila_2.setLayout(new BorderLayout(0, 0));
		
		pilaDos= new Pila();
		pilaDos.setBackground(Color.WHITE);
		panelPila_2.add(pilaDos, BorderLayout.CENTER);
		
		JLabel lblPilas = new JLabel("PILAS");
		lblPilas.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblPilas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilas.setFont(new Font("Gadugi", Font.BOLD, 14));
		panelPilas.add(lblPilas, BorderLayout.NORTH);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setPreferredSize(new Dimension(10, 70));
		panelInferior.setMinimumSize(new Dimension(10, 50));
		panelInferior.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setLayout(new BorderLayout(30, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(10, 20));
		panelInferior.add(panelBotones);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[] {300, 182, 182, 182, 0};
		gbl_panelBotones.rowHeights = new int[]{60, 0};
		gbl_panelBotones.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelBotones.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelBotones.setLayout(gbl_panelBotones);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(4, 4, 4, 4));
		panel.setBackground(UIManager.getColor("TabbedPane.light"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panelBotones.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSeleccionaUnColor = new JLabel("Selecciona un color");
		lblSeleccionaUnColor.setFont(new Font("Nirmala UI", Font.BOLD, 9));
		lblSeleccionaUnColor.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblSeleccionaUnColor.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblSeleccionaUnColor, BorderLayout.NORTH);
		
		panelColores = new SeleccionColores();
		panelColores.setOpaque(false);
		panelColores.setBorder(null);
		panel.add(panelColores, BorderLayout.CENTER);
		panelColores.setLayout(new GridLayout(1, 5, 5, 0));
		
		JButton borrarColor = new JButton("Borrar Color");
		borrarColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		borrarColor.setFocusPainted(false);
		borrarColor.setBackground(Color.WHITE);
		GridBagConstraints gbc_borrarColor = new GridBagConstraints();
		gbc_borrarColor.fill = GridBagConstraints.BOTH;
		gbc_borrarColor.insets = new Insets(0, 0, 0, 5);
		gbc_borrarColor.gridx = 1;
		gbc_borrarColor.gridy = 0;
		panelBotones.add(borrarColor, gbc_borrarColor);
		
		JButton pedirColor = new JButton("Pedir Color");
		pedirColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pedirColor.setFocusPainted(false);
		pedirColor.setBackground(Color.WHITE);
		GridBagConstraints gbc_pedirColor = new GridBagConstraints();
		gbc_pedirColor.fill = GridBagConstraints.BOTH;
		gbc_pedirColor.insets = new Insets(0, 0, 0, 5);
		gbc_pedirColor.gridx = 2;
		gbc_pedirColor.gridy = 0;
		panelBotones.add(pedirColor, gbc_pedirColor);
		
		JButton barajarPila = new JButton("Barajar Pila");
		barajarPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		barajarPila.setFocusPainted(false);
		barajarPila.setBackground(Color.WHITE);
		GridBagConstraints gbc_barajarPila = new GridBagConstraints();
		gbc_barajarPila.fill = GridBagConstraints.BOTH;
		gbc_barajarPila.gridx = 3;
		gbc_barajarPila.gridy = 0;
		panelBotones.add(barajarPila, gbc_barajarPila);
		
		JPanel panelMonedas = new JPanel();
		panelMonedas.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		panelMonedas.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelInferior.add(panelMonedas, BorderLayout.WEST);
		panelMonedas.setLayout(new BorderLayout(5, 0));
		
		JLabel moneda = new JLabel("");
		moneda.setIcon(new ImageIcon(UI.class.getResource("/assets/coin.gif")));
		panelMonedas.add(moneda, BorderLayout.WEST);
		
		cantidadMonedas = new JLabel("0");
		cantidadMonedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelMonedas.add(cantidadMonedas, BorderLayout.EAST);
		
		
		lista = new Lista();
		GridLayout gridLayout_1 = (GridLayout) lista.getLayout();
		gridLayout_1.setColumns(1);
		gridLayout_1.setRows(5);
		lista.setBorder(new LineBorder(new Color(0, 0, 0)));
		lista.setBackground(Color.white);
		
		
		JPanel panelLista = new JPanel();
		panelLista.setBorder(new EmptyBorder(5, 20, 10, 20));
		panelPrincipal.add(panelLista, BorderLayout.CENTER);
		panelLista.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLista = new JLabel("LISTA");
		lblLista.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setFont(new Font("Gadugi", Font.BOLD, 14));
		panelLista.add(lblLista, BorderLayout.NORTH);
		panelLista.add(lista);
	}

	public SeleccionColores getPanelColores() {
		return panelColores;
	}

	public JLabel getCantidadMonedas() {
		return cantidadMonedas;
	}

	public Cola getCola() {
		return cola;
	}

	public Pila getPilaUno() {
		return pilaUno;
	}

	public Pila getPilaDos() {
		return pilaDos;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public Lista getLista() {
		return lista;
	}

}
