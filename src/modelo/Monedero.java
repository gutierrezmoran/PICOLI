package modelo;

import utiles.Constantes;

public class Monedero {

	private int monedas;

	public void incrementar() {
		this.monedas += 2;
	}
	
	public void incrementar(int cantidad) {
		this.monedas += cantidad;
	}

	public void reiniciar() {
		this.monedas = 0;
	}

	public int getMonedasInt() {
		return monedas;
	}
	
	public String getMonedasString() {
		return String.valueOf(this.monedas);
	}

	public boolean isLleno() {
		return this.monedas >= Constantes.CANTIDAD_MAX_MONEDAS;
	}
}
