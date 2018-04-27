package control;

import java.awt.Component;
import javax.swing.JButton;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura estructura = new Estructura();
	private AccionesParaUI accionesParaUI = new AccionesParaUI(this);

	public ParaUI() {
		establecerListeners();
	}

	public void establecerListeners() {
		establecerListenerColores();
	}

	public void establecerListenerColores() {
		for (Component componente : getPaletaDeColores().getPaleta().getComponents()) {
			((JButton) componente).addActionListener(new ActionElegirColor(this));
		}
	}

	public void establecerListenerReiniciar() {
		menu.getReiniciar().addActionListener(new ActionReiniciar(this));
	}
	
	public void reiniciar() {
		this.estructura.reiniciar();
		this.accionesParaUI.reiniciarJuego();
		establecerListeners();
	}

	public Estructura getEstructura() {
		return estructura;
	}

	public AccionesParaUI getAccionesParaUI() {
		return accionesParaUI;
	}

}
