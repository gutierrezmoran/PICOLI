package control.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionActivarTodosColores implements ActionListener {

	private ParaUI paraUI;

	public ActionActivarTodosColores(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.getAccionesActivarTodosColores().generarTodosColores();
		this.paraUI.getAccionesParaUI().actualizarPaletaDeColores();
		this.paraUI.getAccionesActivarTodosColores().actualizarRotuloPaleta();
		this.paraUI.getContentPane().updateUI();
		this.paraUI.establecerListenerElegirColor();
	}

}
