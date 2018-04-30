package vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import controlador.JPanelBackgroundImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class UI extends JFrame {

	protected JPanelBackgroundImage contentPane;
	protected Cabecera cabecera;
	protected Cola cola;
	protected Pila pila1;
	protected Pila pila2;
	protected Lista lista;
	protected Botones botones;
	protected Monedero monedero;
	protected JPanel panelPrincipal;
	protected Menu menu;

	public UI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/assets/icon.png")));
		crear();
		crearCabezera();
		crearPanelPrincipal();
	}

	public void crear() {
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("PICOLI");
		setMinimumSize(new Dimension(1000, 650));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanelBackgroundImage("/assets/bg.jpg");
		contentPane.setOpaque(false);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	public void crearCabezera() {
		this.cabecera = new Cabecera();
		this.contentPane.add(cabecera, BorderLayout.NORTH);
	}

	public void crearPanelPrincipal() {
		panelPrincipal = new JPanel();
		panelPrincipal.setOpaque(false);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		contentPane.add(panelPrincipal, BorderLayout.CENTER);

		crearCola();
		crearPilas();
		crearPanelInferior();
		crearLista();
	}

	private void crearCola() {
		this.cola = new Cola();
		panelPrincipal.add(cola, BorderLayout.NORTH);
	}

	private void crearPilas() {
		JPanel panelPilas = new JPanel();
		panelPilas.setOpaque(false);
		panelPilas.setBorder(new EmptyBorder(5, 20, 10, 20));
		panelPrincipal.add(panelPilas, BorderLayout.WEST);
		panelPilas.setLayout(new BorderLayout(5, 0));
		
		JLabel lblPilas = new JLabel("PILAS");
		lblPilas.setForeground(Color.BLACK);
		lblPilas.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblPilas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPilas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		panelPilas.add(lblPilas, BorderLayout.NORTH);

		this.pila1 = new Pila();
		panelPilas.add(this.pila1, BorderLayout.WEST);

		this.pila2 = new Pila();
		panelPilas.add(this.pila2, BorderLayout.EAST);
	}

	private void crearLista() {
		this.lista = new Lista();
		this.panelPrincipal.add(this.lista, BorderLayout.CENTER);
	}

	private void crearPanelInferior() {
		JPanel panelInferior = new JPanel();
		panelInferior.setOpaque(false);
		panelInferior.setPreferredSize(new Dimension(10, 70));
		panelInferior.setMinimumSize(new Dimension(10, 50));
		panelInferior.setBorder(new EmptyBorder(10, 20, 10, 20));
		panelInferior.setLayout(new BorderLayout(95, 0));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

		this.botones = new Botones();
		panelInferior.add(this.botones, BorderLayout.CENTER);

		this.monedero = new Monedero();
		panelInferior.add(this.monedero, BorderLayout.WEST);
	}

	public void crearMenu(boolean estado) {
		this.contentPane.remove(cabecera);
		this.panelPrincipal.removeAll();
		
		this.menu = new Menu(estado);
		this.panelPrincipal.add(this.menu, BorderLayout.CENTER);
	}

	public JPanelBackgroundImage getContentPane() {
		return contentPane;
	}

	public Cabecera getCabecera() {
		return cabecera;
	}

	public Cola getCola() {
		return cola;
	}

	public Pila getPila1() {
		return pila1;
	}

	public Pila getPila2() {
		return pila2;
	}

	public Lista getLista() {
		return lista;
	}

	public Botones getBotones() {
		return botones;
	}

	public PaletaDeColores getPaletaDeColores() {
		return botones.getPaletaDeColores();
	}

	public Comodines getComodines() {
		return botones.getComodines();
	}

	public Monedero getMonedero() {
		return monedero;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public JPanel getMenu() {
		return this.menu;
	}

	public JButton getBarajarPila() {
		return botones.getBarajarPila();
	}

}
