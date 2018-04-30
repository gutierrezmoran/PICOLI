package controlador.acciones;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;

import controlador.ParaUI;

public class AccionesBorrarColor {

	private ParaUI paraUI;

	public AccionesBorrarColor(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	public void borrarColor(Color color) {
		if (!this.paraUI.getEstructura().getBorradorColores().borrarColor(color)) {
			this.paraUI.getBotones().getComodines().getBorrarColor().setEnabled(false);
		}
	}

	public void actualizarPaleta() {
		this.paraUI.getPaletaDeColores().getPaleta().removeAll();
		Color colorActual;
		for (Component color : this.paraUI.getLista().getLista().getComponents()) {
			colorActual = ((JLabel) color).getBackground();
			if (!this.paraUI.getPaletaDeColores().buscar(colorActual)) {
				this.paraUI.getPaletaDeColores().agregar(colorActual);
			}
		}
	}

	public void actualizarRotuloPaleta() {
		this.paraUI.getBotones().getPaletaDeColores().getLabelPanelColores().setText("SELECCIONAR UN COLOR PARA BORRAR DE LA LISTA");
	}

}
