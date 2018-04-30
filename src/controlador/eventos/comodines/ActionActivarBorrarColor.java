package controlador.eventos.comodines;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controlador.ParaUI;

public class ActionActivarBorrarColor implements ActionListener {
	
	private ParaUI paraUI;
	
	public ActionActivarBorrarColor(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!this.paraUI.isListaVacia()) {
			this.paraUI.getAccionesBorrarColor().actualizarPaleta();
			this.paraUI.getAccionesBorrarColor().actualizarRotuloPaleta();
			this.paraUI.getContentPane().updateUI();
			this.paraUI.establecerListenerBorrarColor();
		}
	}

}
