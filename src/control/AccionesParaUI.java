package control;

import java.awt.Color;

public class AccionesParaUI {
	private ParaUI paraUI;

	public AccionesParaUI(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
		actualizarUI();
	}
	
	public void realizarJugada(Color color) {
		if(this.paraUI.getControl().realizarJugada(color)) {
			
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
		this.paraUI.getControl().getHistorial().renovarColores();
		actualizarColoresSeleccionados();
	}
	
	private void actualizarMonedas() {
		this.paraUI.getCantidadMonedas().setText(String.valueOf(this.paraUI.getControl().getMonedas()));
	}

	private void actualizarPilas() {
		actualizarPilaUno();
		actualizarPilaDos();
	}
	
	private void actualizarColoresSeleccionados() {
		this.paraUI.getPanelColores().removeAll();
		for(Color color : this.paraUI.getControl().getHistorial().getColoresSeleccionados()) {
			this.paraUI.getPanelColores().agregarColor(color);
		}
	}
	
	private void actualizarPilaDos() {
		this.paraUI.getPilaDos().removeAll();
		int i = 0;
		for(Color color : this.paraUI.getControl().getPilas().get(1).getPila()) {
			this.paraUI.getPilaDos().agregarColor(color, i);
			i++;
		}
	}

	private void actualizarPilaUno() {
		this.paraUI.getPilaUno().removeAll();
		int i = 0;
		for(Color color : this.paraUI.getControl().getPilas().get(0).getPila()) {
			this.paraUI.getPilaUno().agregarColor(color, i);
			i++;
		}
	}

	private void actualizarCola() {
		this.paraUI.getCola().removeAll();
		for(Color color : this.paraUI.getControl().getCola().getCola()) {
			this.paraUI.getCola().agregarColor(color);
		}
	}
	
	private void actualizarLista() {
		this.paraUI.getLista().removeAll();
		int i = 0;
		for(Color color : this.paraUI.getControl().getLista().getLista()) {
			this.paraUI.getLista().agregarColor(color, i);
			i++;
		}
	}
}
