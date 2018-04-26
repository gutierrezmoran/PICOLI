package control;

import java.awt.Component;
import javax.swing.JButton;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura control = new Estructura();
	private AccionesParaUI accionesParaUI = new AccionesParaUI(this);

	public ParaUI() {
		establecerListeners();
	}

	public void establecerListeners() {
		establecerListenersColores();
	}

	public void establecerListenersColores() {
		for (Component componente : getPanelColores().getComponents()) {
			((JButton) componente).addActionListener(new ActionElegirColor(this));
		}
	}

	public void establecerListenerReiniciar() {
		reiniciar.addActionListener(new ActionReiniciar(this));
	}

	public Estructura getControl() {
		return control;
	}

	public AccionesParaUI getAccionesParaUI() {
		return accionesParaUI;
	}

}
