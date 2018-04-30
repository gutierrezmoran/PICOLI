package modelo;

import utiles.Constantes;

public class SeleccionadorTodosColores {

	private int disponibilidad;

	public SeleccionadorTodosColores() {
		inicializar();
	}

	public void inicializar() {
		this.disponibilidad = Constantes.PETICION_COLOR_MAX;
	}

	public void decrementarDisponibilidad() {
		this.disponibilidad--;
	}

	public boolean comprobarVecesUsado() {
		return this.disponibilidad > 0;
	}

	public int getDisponibilidad() {
		return disponibilidad;
	}

}
