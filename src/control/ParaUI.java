package control;

import java.awt.Component;
import javax.swing.JButton;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura control = new Estructura();
	private AccionesParaUI accionesParaUI = new AccionesParaUI(this);
	
	public ParaUI() {
		establecerListenersColores();
	}
	
	public void establecerListeners() {
		establecerListenersColores();
	}

	private void establecerListenersColores() {
		for (Component componente : panelColores.getComponents()) {
			((JButton) componente).addActionListener(new ActionElegirColor(this));
		}
	}

	public Estructura getControl() {
		return control;
	}

	public AccionesParaUI getAccionesParaUI() {
		return accionesParaUI;
	}
	
}
