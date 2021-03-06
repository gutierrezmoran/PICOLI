package controlador.acciones;

import java.awt.Color;
import controlador.ParaUI;

public class AccionesEstructura {

	private ParaUI paraUI;

	public AccionesEstructura(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
		actualizarUI();
	}

	public void actualizarUI() {
		actualizarCola();
		actualizarPilas();
		actualizarLista();
		actualizarMonedas();
		actualizarBorrarColor();
		actualizarTodosColores();
		actualizarBarajarPilas();
		this.paraUI.getEstructura().getPaletaDeColores().renovar();
		actualizarPaletaDeColores();
		this.paraUI.getContentPane().updateUI();
	}

	private void actualizarMonedas() {
		this.paraUI.getMonedero().getMonedas().setText(this.paraUI.getEstructura().getMonedasString());
	}

	public void actualizarPilas() {
		actualizarPila1();
		actualizarPila2();
	}
	
	private void actualizarBorrarColor() {
		this.paraUI.getBotones().getComodines().getLabelBorrarColor().setText(this.paraUI.getEstructura().getBorradorColores().getDisponibilidadString());
	}
	
	private void actualizarTodosColores() {
		this.paraUI.getBotones().getComodines().getLabelPedirColor().setText(this.paraUI.getEstructura().getSeleccionadorTodosColores().getDisponibilidadString());
	}
	
	public void actualizarBarajarPilas() {
		this.paraUI.getBotones().getComodines().getLabelBarajarPila().setText(this.paraUI.getEstructura().getBarajadorPilas().getDisponibilidadString());
	}

	public void actualizarPaletaDeColores() {
		this.paraUI.getPaletaDeColores().getPaleta().removeAll();
		for (Color color : this.paraUI.getEstructura().getPaletaDeColores().getPaletaDeColores()) {
			this.paraUI.getPaletaDeColores().agregar(color);
		}
	}
	
	public void actualizarRotuloPaleta() {
		this.paraUI.getBotones().getPaletaDeColores().getLabelPanelColores().setText("SELECCIONE UN COLOR");
	}

	private void actualizarPila2() {
		this.paraUI.getPila2().getPila().removeAll();
		for (Color color : this.paraUI.getEstructura().getPilas().get(1).getPila()) {
			this.paraUI.getPila2().agregar(color);
		}
	}

	private void actualizarPila1() {
		this.paraUI.getPila1().getPila().removeAll();
		for (Color color : this.paraUI.getEstructura().getPilas().get(0).getPila()) {
			this.paraUI.getPila1().agregar(color);
		}
	}

	private void actualizarCola() {
		this.paraUI.getCola().getCola().removeAll();
		for (Color color : this.paraUI.getEstructura().getCola().getCola()) {
			this.paraUI.getCola().agregar(color);
		}
	}

	private void actualizarLista() {
		this.paraUI.getLista().getLista().removeAll();
		for (Color color : this.paraUI.getEstructura().getLista().getLista()) {
			this.paraUI.getLista().agregar(color);
		}
	}

	public void reiniciarJuego() {
		this.paraUI.crearCabezera();

		this.paraUI.getContentPane().remove(this.paraUI.getPanelPrincipal());
		this.paraUI.crearPanelPrincipal();
		actualizarUI();
	}
}
