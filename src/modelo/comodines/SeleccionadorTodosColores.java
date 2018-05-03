package modelo.comodines;

import utiles.Constantes;

public class SeleccionadorTodosColores {

	private int disponibilidad;
	private boolean desactivado = true;

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
	
	public boolean isDesactivado() {
		return desactivado;
	}
	
	public void activar() {
		this.desactivado = false;
	}
	
	public void desactivar() {
		this.desactivado = true;
	}

	public String getDisponibilidadString() {
		return String.valueOf(this.disponibilidad);
	}

}
