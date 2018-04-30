package controlador;

import java.awt.Component;
import javax.swing.JButton;
import controlador.acciones.*;
import controlador.eventos.*;
import controlador.eventos.comodines.ActionActivarBorrarColor;
import controlador.eventos.comodines.ActionActivarTodosColores;
import controlador.eventos.comodines.ActionBarajarPilas;
import controlador.eventos.comodines.ActionBorrarColor;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura estructura;
	private AccionesParaUI accionesParaUI;
	private AccionesBorrarColor accionesBorrarColor;
	private AccionesSeleccionarColor accionesSeleccionarColor;
	private AccionesActivarTodosColores accionesActivarTodosColores;
	private AccionesBarajarPilas accionesBarajarPilas;

	public ParaUI() {
		this.estructura = new Estructura();
		this.accionesParaUI = new AccionesParaUI(this);
		this.accionesBorrarColor = new AccionesBorrarColor(this);
		this.accionesSeleccionarColor = new AccionesSeleccionarColor(this);
		this.accionesActivarTodosColores = new AccionesActivarTodosColores(this);
		this.accionesBarajarPilas = new AccionesBarajarPilas(this);
		establecerListeners();
	}

	private void establecerListeners() {
		establecerListenerElegirColor();
		establecerListenerActivarBorrarColor();
		establecerListenerActivarTodosColores();
		establecerListenerBarajarPilas();
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
	
	public void establecerListenerBarajarPilas() {
		getBarajarPila().addActionListener(new ActionBarajarPilas(this));
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

	public AccionesBarajarPilas getAccionesBarajarPilas() {
		return accionesBarajarPilas;
	}

	public boolean isDesactivadoSeleccionadorTodosColores() {
		return estructura.isDesactivadoSeleccionadorTodosColores();
	}

	public void activarSeleccionadorTodosColores() {
		estructura.activarSeleccionadorTodosColores();
	}

	public void desactivarSeleccionadorTodosColores() {
		estructura.desactivarSeleccionadorTodosColores();
	}

}
