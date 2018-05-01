package controlador.eventos.comodines;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.ParaUI;

public class ActionActivarTodosColores implements ActionListener {

	private ParaUI paraUI;

	public ActionActivarTodosColores(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.paraUI.getEstructura().getSeleccionadorTodosColores().isDesactivado()) {
			this.paraUI.getAccionesActivarTodosColores().generarTodosColores();
			this.paraUI.getAccionesEstructura().actualizarPaletaDeColores();
			this.paraUI.getAccionesActivarTodosColores().actualizarRotuloPaleta();
			this.paraUI.getContentPane().updateUI();
			this.paraUI.establecerListenerElegirColor();
		}
	}
}
