package control;

import java.awt.BorderLayout;
import java.awt.Color;

public class AccionesParaUI {

	private ParaUI paraUI;

	public AccionesParaUI(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
		actualizarUI();
	}

	public void realizarJugada(Color color) {
		assert color != null : "El color es nulo";
		
		if (this.paraUI.getEstructura().realizarJugada(color)) {
			this.paraUI.crearMenu(this.paraUI.getEstructura().isTesoroLleno());
			this.paraUI.establecerListenerReiniciar();
		} else {
			actualizarUI();
			this.paraUI.establecerListeners();
		}
	}

	public void actualizarUI() {
		actualizarCola();
		actualizarPilas();
		actualizarLista();
		actualizarMonedas();
		this.paraUI.getEstructura().getPaletaDeColores().renovar();
		actualizarPaletaDeColores();
		this.paraUI.getContentPane().updateUI();
	}

	private void actualizarMonedas() {
		this.paraUI.getMonedero().getMonedas().setText(String.valueOf(this.paraUI.getEstructura().getMonedas()));
	}

	private void actualizarPilas() {
		actualizarPila1();
		actualizarPila2();
	}

	private void actualizarPaletaDeColores() {
		this.paraUI.getPaletaDeColores().getPaleta().removeAll();
		for (Color color : this.paraUI.getEstructura().getPaletaDeColores().getPaletaDeColores()) {
			this.paraUI.getPaletaDeColores().agregar(color);
		}
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
