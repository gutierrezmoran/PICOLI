package control;

import java.awt.Component;
import javax.swing.JButton;

import control.acciones.AccionesActivarTodosColores;
import control.acciones.AccionesBorrarColor;
import control.acciones.AccionesParaUI;
import control.acciones.AccionesSeleccionarColor;
import control.eventos.ActionActivarBorrarColor;
import control.eventos.ActionActivarTodosColores;
import control.eventos.ActionBorrarColor;
import control.eventos.ActionElegirColor;
import control.eventos.ActionReiniciar;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura estructura = new Estructura();
	private AccionesParaUI accionesParaUI = new AccionesParaUI(this);
	private AccionesBorrarColor accionesBorrarColor = new AccionesBorrarColor(this);
	private AccionesSeleccionarColor accionesSeleccionarColor = new AccionesSeleccionarColor(this);
	private AccionesActivarTodosColores accionesActivarTodosColores = new AccionesActivarTodosColores(this);

	public ParaUI() {
		establecerListeners();
	}

	private void establecerListeners() {
		establecerListenerElegirColor();
		establecerListenerActivarBorrarColor();
		establecerListenerActivarTodosColores();
	}

	public void establecerListenerElegirColor() {
		for (Component componente : getPaletaDeColores().getPaleta().getComponents()) {
			((JButton) componente).addMouseListener(new ActionElegirColor(this));
		}
	}

	public void establecerListenerActivarBorrarColor() {
		getBotones().getComodines().getBorrarColor().addActionListener(new ActionActivarBorrarColor(this));
	}
	
	public void establecerListenerActivarTodosColores() {
		getBotones().getComodines().getPedirColor().addActionListener(new ActionActivarTodosColores(this));
	}

	public void establecerListenerBorrarColor() {
		for (Component componente : getPaletaDeColores().getPaleta().getComponents()) {
			((JButton) componente).addMouseListener(new ActionBorrarColor(this));
		}
	}

	public void establecerListenerReiniciar() {
		menu.getReiniciar().addMouseListener(new ActionReiniciar(this));
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

	public AccionesBorrarColor getAccionesBorrarColor() {
		return accionesBorrarColor;
	}

	public AccionesSeleccionarColor getAccionesSeleccionarColor() {
		return accionesSeleccionarColor;
	}

	public boolean isListaVacia() {
		return estructura.isListaVacia();
	}

	public AccionesActivarTodosColores getAccionesActivarTodosColores() {
		return accionesActivarTodosColores;
	}

}
