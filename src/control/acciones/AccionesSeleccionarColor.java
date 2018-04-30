package control.acciones;

import java.awt.Color;

import control.ParaUI;

public class AccionesSeleccionarColor {

	private ParaUI paraUI;
	
	public AccionesSeleccionarColor(ParaUI paraUI) {
		this.paraUI = paraUI;
	}
	
	public void seleccionarColor(Color color) {
		assert color != null : "El color es nulo";
		
		if (this.paraUI.getEstructura().realizarJugada(color)) {
			this.paraUI.crearMenu(this.paraUI.getEstructura().isTesoroLleno());
			this.paraUI.getContentPane().updateUI();
			this.paraUI.establecerListenerReiniciar();
		} else {
			this.paraUI.getAccionesParaUI().actualizarUI();
			this.paraUI.establecerListenerElegirColor();
		}
		
		if(!this.paraUI.getEstructura().getSeleccionadorTodosColores().comprobarVecesUsado()) {
			this.paraUI.getBotones().getComodines().getPedirColor().setEnabled(false);
		}
		
		this.paraUI.getAccionesParaUI().actualizarRotuloPaleta();
	}
}
