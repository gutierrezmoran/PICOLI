package modelo;

import utiles.Constantes;

public class Tesoro {

	private int monedas;

	public void incrementar() {
		this.monedas += 2;
	}

	public void reiniciar() {
		this.monedas = 0;
	}

	public int getMonedas() {
		return monedas;
	}

	public boolean isLleno() {
		return this.monedas >= Constantes.CANTIDAD_MAX_MONEDAS;
	}
}