package modelo;

import java.awt.Color;
import java.util.AbstractCollection;

import java.util.ArrayList;
import java.util.Stack;
import utiles.Constantes;
import utiles.Utiles;

public class Estructura {
	private Cola cola;
	private ArrayList<Pila> pilas;
	private Lista lista;
	private int monedas;
	private Historial historial;

	public int getMonedas() {
		return monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}

	public Estructura() {
		this.cola = new Cola();
		this.pilas = new ArrayList<>();
		this.lista = new Lista();
		this.historial = new Historial();
		inicializarCola();
		inicializarPilas();
	}

	public Historial getHistorial() {
		return historial;
	}

	public Cola getCola() {
		return cola;
	}

	public ArrayList<Pila> getPilas() {
		return pilas;
	}

	public Lista getLista() {
		return lista;
	}

	public void inicializarCola() {
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			this.cola.encolar(Colores.getElement(Utiles.generarNumeroAleatorio(1, 5)));
		}
	}
	
	public void inicializarPilas() {
		for (int i = 0; i < 2; i++) {
			this.pilas.add(new Pila());
		}
	}

	public boolean realizarJugada(Color color) {
		this.cola.encolar(color);
		this.historial.actualizarHistorial(color);
		int pilaSeleccionada = getIndicePilaAleatoria();
		this.pilas.get(pilaSeleccionada).apilar(this.cola.desencolar());
		
		if (isColeccionLlena(this.pilas.get(pilaSeleccionada).getPila(), Constantes.TAMANO_PILA)) {
			this.lista.alistar(this.pilas.get(pilaSeleccionada).desapilar());
		}
		
		while (isColoresIgualesContiguos(this.lista.getLista())) {
			this.lista.desalistarRepetidos(getColorIgualContiguo(this.lista.getLista()));
			incrementarMonedas();
			if (isMonedasGanadoras()) {
				return true;
			}
		}
		if (isColeccionLlena(this.lista.getLista(), Constantes.TAMANO_LISTA_LADO)) {
			return true;
		}

		return false;
	}

	/**
	 * Incrementa las monedas (+2)
	 */
	private void incrementarMonedas() {
		this.monedas+=2;
	}

	/**
	 * Retorna una pila aleatoria
	 * 
	 * @return
	 */
	private int getIndicePilaAleatoria() {
		int numero = Utiles.generarNumeroAleatorio(0, 2);
		if (isColeccionLlena(this.pilas.get(numero).getPila(), Constantes.TAMANO_PILA)) {
			return ((numero + 1) % 2);
		} else {
			return numero;
		}

	}

	/**
	 * Comprueba si una coleccion esta llena
	 * 
	 * @param coleccion
	 * @param limite
	 * @return Retorna TRUE en caso de que este llena o FALSE en caso contrario.
	 */
	public boolean isColeccionLlena(AbstractCollection<Color> coleccion, int limite) {
		return coleccion.size() > limite;

	}

	/**
	 * Comprueba si dentro de una coleccion hay dos colores iguales y contiguos.
	 * 
	 * @param coleccion
	 * @return Retorna TRUE si hay dos colores iguales y contiguos o FALSE en caso
	 *         contrario.
	 */
	public boolean isColoresIgualesContiguos(AbstractCollection<Color> coleccion) {
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if (comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Comprueba si se ha superado-igualado o no la cantidad de monedas necesarias
	 * para ganar la partida
	 * 
	 * @param monedas
	 * @return Retorna TRUE si se ha igualado o superado la cantidad de monedas o
	 *         FALSE en caso contrario
	 */
	public boolean isMonedasGanadoras() {
		return this.monedas >= Constantes.CANTIDAD_MAX_MONEDAS;
	}

	/**
	 * 
	 * Comprueba la posicion del color repetido en una coleccion
	 * 
	 * @param coleccion
	 * @return Retorna la posicion del color repetido
	 */
	public int getColorIgualContiguo(AbstractCollection<Color> coleccion) {
		int indice = 0;
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if (comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				indice = i;
				break;
			}
		}
		return indice;
	}

	private boolean comprobarColoresIguales(Color color1, Color color2) {
		return color1 == color2;
	}

	private Color getColor(AbstractCollection<Color> coleccion, int posicion) {
		if (coleccion instanceof Stack) {
			return ((Stack<Color>) coleccion).get(posicion);
		}
		return ((ArrayList<Color>) coleccion).get(posicion);
	}

}
