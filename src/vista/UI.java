package vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import control.JPanelBackgroundImage;
import font.CustomFont;
import utiles.Utiles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class UI extends JFrame {

	private CustomFont customFont = new CustomFont("Patchwork Stitchlings Color.ttf");
	private Color colorBackgroundPaneles = new Color(255, 255, 255, 100);
	private JPanelBackgroundImage contentPane;
	private JPanel panelTituloJuego;
	private Cola cola;
	private Pila pilaUno;
	private Pila pilaDos;
	private Lista lista;
	private SeleccionColores panelColores;
	private JLabel cantidadMonedas;
	private JPanel panelPrincipal;
	protected JButton reiniciar;

	public UI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/assets/icon.png")));
		crearFrame();
		crearCabezera();
		crearPanelPrincipal();
	}

	public void crearFrame() {
		// setExtendedState(MAXIMIZED_BOTH);
		setTitle("PICOLI");
		setMinimumSize(new Dimension(1000, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanelBackgroundImage("/assets/bg.jpg");
		contentPane.setOpaque(false);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	private void crearCabezera() {
		panelTituloJuego = new JPanel();
		panelTituloJuego.setBackground(new Color(0, 128, 128));
		this.contentPane.add(panelTituloJuego, BorderLayout.NORTH);
		panelTituloJuego.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("PICOLI");
		lblNewLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setFont(this.customFont.MyFont(0, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTituloJuego.add(lblNewLabel);
	}

	public void crearPanelPrincipal() {
		panelPrincipal = new JPanel();
		panelPrincipal.setOpaque(false);
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));

		crearCola();
		crearPilas();
		crearControl();
		crearLista();
	}

	private void crearCola() {
		JPanel panelCola = new JPanel();
		panelCola.setOpaque(false);
		panelCola.setBorder(new EmptyBorder(10, 20, 5, 20));
		panelPrincipal.add(panelCola, BorderLayout.NORTH);
		panelCola.setLayout(new BorderLayout(0, 0));

		this.cola = new Cola();
		cola.setOpaque(false);
		GridLayout gridLayout = (GridLayout) cola.getLayout();
		gridLayout.setHgap(5);
		panelCola.add(cola, BorderLayout.CENTER);
		cola.setPreferredSize(new Dimension(10, 80));
		cola.setMinimumSize(new Dimension(10, 80));

		JPanel panelCabeceraCola = new JPanel();
		panelCabeceraCola.setOpaque(false);
		panelCola.add(panelCabeceraCola, BorderLayout.NORTH);
		panelCabeceraCola.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("COLA");
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 5, 0));
		panelCabeceraCola.add(lblNewLabel_1, BorderLayout.NORTH);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));

		JPanel panelPieCola = new JPanel();
		panelPieCola.setOpaque(false);
		panelPieCola.setBorder(null);
		panelCola.add(panelPieCola, BorderLayout.SOUTH);
		panelPieCola.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UI.class.getResource("/assets/rojaAbajo.png")));
		panelPieCola.add(lblNewLabel_2, BorderLayout.WEST);
		lblNewLabel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UI.class.getResource("/assets/verdeIzquierda.png")));
		panelPieCola.add(lblNewLabel_3, BorderLayout.EAST);
		lblNewLabel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
	}

	private void crearPilas() {
		JPanel panelPilas = new JPanel();
		panelPilas.setOpaque(false);
		panelPilas.setBorder(new EmptyBorder(5, 20, 10, 20));
		panelPrincipal.add(panelPilas, BorderLayout.WEST);
		panelPilas.setLayout(new BorderLayout(5, 0));

		JPanel panelPila_1 = new JPanel();
		panelPila_1.setBorder(null);
		panelPila_1.setPreferredSize(new Dimension(60, 10));
		panelPila_1.setMinimumSize(new Dimension(30, 10));
		panelPilas.add(panelPila_1, BorderLayout.WEST);
		panelPila_1.setLayout(new BorderLayout(0, 0));

		pilaUno = new Pila();
		pilaUno.setBorder(null);
		pilaUno.setBackground(this.colorBackgroundPaneles);
		panelPila_1.add(pilaUno);

		JPanel panelPila_2 = new JPanel();
		panelPila_2.setBorder(null);
		panelPila_2.setPreferredSize(new Dimension(60, 10));
		panelPilas.add(panelPila_2, BorderLayout.EAST);
		panelPila_2.setLayout(new BorderLayout(0, 0));

		pilaDos = new Pila();
		pilaDos.setBorder(null);
		pilaDos.setBackground(this.colorBackgroundPaneles);
		panelPila_2.add(pilaDos, BorderLayout.CENTER);

		JLabel lblPilas = new JLabel("PILAS");
		lblPilas.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblPilas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPilas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		panelPilas.add(lblPilas, BorderLayout.NORTH);
	}

	private void crearLista() {
		lista = new Lista();
		GridLayout gridLayout_1 = (GridLayout) lista.getLayout();
		gridLayout_1.setColumns(1);
		gridLayout_1.setRows(5);
		lista.setBorder(null);
		lista.setBackground(this.colorBackgroundPaneles);

		JPanel panelLista = new JPanel();
		panelLista.setOpaque(false);
		panelLista.setBorder(new EmptyBorder(5, 20, 10, 20));
		panelPrincipal.add(panelLista, BorderLayout.CENTER);
		panelLista.setLayout(new BorderLayout(0, 0));

		JLabel lblLista = new JLabel("LISTA");
		lblLista.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblLista.setHorizontalAlignment(SwingConstants.LEFT);
		lblLista.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		panelLista.add(lblLista, BorderLayout.NORTH);
		panelLista.add(lista);
	}

	private void crearControl() {
		JPanel panelInferior = new JPanel();
		panelInferior.setOpaque(false);
		panelInferior.setPreferredSize(new Dimension(10, 70));
		panelInferior.setMinimumSize(new Dimension(10, 50));
		panelInferior.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setLayout(new BorderLayout(95, 0));

		JPanel panelBotones = new JPanel();
		panelBotones.setOpaque(false);
		panelBotones.setPreferredSize(new Dimension(10, 20));
		panelInferior.add(panelBotones);
		panelBotones.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 10));
		panel.setOpaque(false);
		panel.setBorder(null);
		panelBotones.add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblSeleccionaUnColor = new JLabel("SELECCIONA UN COLOR");
		lblSeleccionaUnColor.setFont(new Font("Alef", Font.BOLD, 12));
		lblSeleccionaUnColor.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblSeleccionaUnColor.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblSeleccionaUnColor, BorderLayout.NORTH);

		panelColores = new SeleccionColores();
		panelColores.setOpaque(false);
		panelColores.setBorder(null);
		panel.add(panelColores, BorderLayout.CENTER);
		panelColores.setLayout(new GridLayout(1, 5, 5, 0));

		JPanel panelComodines = new JPanel();
		panelComodines.setOpaque(false);
		panelBotones.add(panelComodines, BorderLayout.EAST);
		panelComodines.setLayout(new BorderLayout(0, 0));

		JPanel panelIconos = new JPanel();
		panelIconos.setOpaque(false);
		panelComodines.add(panelIconos, BorderLayout.NORTH);
		panelIconos.setLayout(new GridLayout(0, 3, 20, 0));

		JButton borrarColor = new JButton("");
		borrarColor.setToolTipText(
				"Permite elegir un color que eliminar\u00E1 todos aquellos iguales que se encuentren en la lista");
		panelIconos.add(borrarColor);
		borrarColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		borrarColor.setContentAreaFilled(false);
		borrarColor.setBorderPainted(false);
		borrarColor.setOpaque(false);
		borrarColor.setIcon(new ImageIcon(UI.class.getResource("/assets/goma.png")));
		borrarColor.setBorder(null);
		borrarColor.setFont(new Font("Tahoma", Font.BOLD, 20));
		borrarColor.setFocusPainted(false);

		JButton pedirColor = new JButton("");
		pedirColor.setToolTipText("Permite seleccionar un color de los 5 disponibles");
		panelIconos.add(pedirColor);
		pedirColor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pedirColor.setContentAreaFilled(false);
		pedirColor.setBorderPainted(false);
		pedirColor.setBorder(null);
		pedirColor.setOpaque(false);
		pedirColor.setIcon(new ImageIcon(UI.class.getResource("/assets/paleta.png")));
		pedirColor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pedirColor.setFocusPainted(false);

		JButton barajarPila = new JButton("");
		barajarPila.setToolTipText("Baraja las pilas alterando su orden actual y equilibr\u00E1ndolas");
		panelIconos.add(barajarPila);
		barajarPila.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		barajarPila.setContentAreaFilled(false);
		barajarPila.setBorderPainted(false);
		barajarPila.setOpaque(false);
		barajarPila.setBorder(null);
		barajarPila.setIcon(new ImageIcon(UI.class.getResource("/assets/barajar.png")));
		barajarPila.setFont(new Font("Tahoma", Font.PLAIN, 10));
		barajarPila.setFocusPainted(false);

		JPanel panelCantidades = new JPanel();
		panelCantidades.setOpaque(false);
		panelComodines.add(panelCantidades, BorderLayout.SOUTH);
		panelCantidades.setLayout(new GridLayout(0, 3, 20, 0));

		JLabel labelBorrarColor = new JLabel("0");
		labelBorrarColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidades.add(labelBorrarColor);

		JLabel labelPedirColor = new JLabel("0");
		labelPedirColor.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidades.add(labelPedirColor);

		JLabel labelBarajarPila = new JLabel("0");
		labelBarajarPila.setHorizontalAlignment(SwingConstants.CENTER);
		panelCantidades.add(labelBarajarPila);

		JPanel panelMonedas = new JPanel();
		panelMonedas.setOpaque(false);
		panelMonedas.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelInferior.add(panelMonedas, BorderLayout.WEST);
		panelMonedas.setLayout(new BorderLayout(5, 0));

		JLabel moneda = new JLabel("");
		moneda.setIcon(new ImageIcon(UI.class.getResource("/assets/coin.gif")));
		panelMonedas.add(moneda, BorderLayout.WEST);

		cantidadMonedas = new JLabel("0");
		cantidadMonedas.setFont(new Font("Tahoma", Font.BOLD, 23));
		panelMonedas.add(cantidadMonedas, BorderLayout.EAST);
	}

	public void crearMenu(boolean estado) {
		this.panelPrincipal.removeAll();

		if (estado) {
			crearMenuVictoria();
		} else {
			crearMenuDerrota();
		}

		reiniciar = new JButton("REINICIAR");
		reiniciar.setBorder(new EmptyBorder(50, 5, 50, 5));
		this.panelPrincipal.add(reiniciar, BorderLayout.SOUTH);
	}

	private void crearMenuVictoria() {
		this.panelPrincipal.setBackground(Color.GREEN);

		JLabel mensajePartida = new JLabel("PICOLI WIN");
		mensajePartida.setFont(new Font("Arial", Font.BOLD, 60));
		mensajePartida.setForeground(Color.WHITE);
		mensajePartida.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelPrincipal.add(mensajePartida, BorderLayout.CENTER);
	}

	private void crearMenuDerrota() {
		this.panelPrincipal.setBackground(Color.RED);

		JLabel mensajePartida = new JLabel("PICOLI OVER");
		mensajePartida.setFont(new Font("Arial", Font.BOLD, 60));
		mensajePartida.setForeground(Color.WHITE);
		mensajePartida.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelPrincipal.add(mensajePartida, BorderLayout.CENTER);
	}

	@Override
	public Image getIconImage() {
		String imagen = "/assets/icon" + Utiles.generarNumeroAleatorio(0, 5) + ".png";
		Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(imagen));

		return retValue;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelTituloJuego() {
		return panelTituloJuego;
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

	public Lista getLista() {
		return lista;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

}
