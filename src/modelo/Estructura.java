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
	private Monedero tesoro;
	private HistorialColores historialColores;
	private PaletaDeColores paletaDeColores;

	public Estructura() {
		this.cola = new Cola();
		this.pilas = new ArrayList<>();
		this.lista = new Lista();
		this.tesoro = new Monedero();
		this.historialColores = new HistorialColores();
		this.paletaDeColores = new PaletaDeColores(historialColores);
		inicializar();
	}

	public void inicializar() {
		this.cola.inicializar();
		inicializarPilas();
	}

	public void reiniciar() {
		this.cola.reiniciar();
		this.lista.reiniciar();
		this.tesoro.reiniciar();
		this.historialColores.limpiar();
		this.paletaDeColores.limpiar();
		reiniciarPilas();
	}

	private void reiniciarPilas() {
		this.pilas.get(0).limpiar();
		this.pilas.get(1).limpiar();
		inicializarPilas();
	}

	private void inicializarPilas() {
		for (int i = 0; i < Constantes.CANTIDAD_PILAS; i++) {
			this.pilas.add(new Pila());
		}
	}

	public boolean realizarJugada(Color color) {
		assert (color != null) : "El color es nulo";
		
		this.cola.encolar(color);
		this.historialColores.actualizar(color);
		int pilaSeleccionada = getIndicePilaAleatoria();
		this.pilas.get(pilaSeleccionada).apilar(this.cola.desencolar());

		if (isColeccionLlena(this.pilas.get(pilaSeleccionada).getPila(), Constantes.TAMANO_PILA)) {
			this.lista.alistar(this.pilas.get(pilaSeleccionada).desapilar());
		}

		while (isColoresIgualesContiguos(this.lista.getLista())) {
			this.lista.desalistarRepetidos(getColorIgualContiguo(this.lista.getLista()));
			this.tesoro.incrementar();
			if (this.tesoro.isLleno()) {
				return true;
			}
		}
		if (isColeccionLlena(this.lista.getLista(), Constantes.TAMANO_LISTA_LADO)) {
			return true;
		}

		return false;
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
		assert (coleccion != null) : "La coleccion es nula";
		assert (limite > 0) : "El limite es igual o inferior a 0";

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
		assert (coleccion != null) : "La coleccion es nula";
		
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if (comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * Comprueba la posicion del color repetido en una coleccion
	 * 
	 * @param coleccion
	 * @return Retorna la posicion del color repetido
	 */
	public int getColorIgualContiguo(AbstractCollection<Color> coleccion) {
		assert (coleccion != null) : "La coleccion es nula";
		
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
		assert (color1 != null && color2 != null) : "Alguno de los colores es nulo";

		return color1 == color2;
	}

	private Color getColor(AbstractCollection<Color> coleccion, int posicion) {
		assert (coleccion != null) : "La coleccione es nula";
		assert posicion >= 0 : "La posicion es inferior a 0";
		
		if (coleccion instanceof Stack) {
			return ((Stack<Color>) coleccion).get(posicion);
		}
		return ((ArrayList<Color>) coleccion).get(posicion);
	}

	public HistorialColores getHistorialColores() {
		return historialColores;
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

	public PaletaDeColores getPaletaDeColores() {
		return paletaDeColores;
	}

	public boolean isTesoroLleno() {
		return tesoro.isLleno();
	}

	public int getMonedas() {
		return tesoro.getMonedas();
	}

}
