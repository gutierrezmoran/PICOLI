package modelo.comodines;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Stack;
import modelo.Pila;
import utiles.Constantes;
import utiles.Utiles;

public class Barajador {

	private ArrayList<Color> coloresPilas;
	private final int MOVIMIENTOS_BARAJAR = 100;
	private boolean primeraObtencion;
	private int disponibilidad;
	private int mitadCantidadElementos;

	public Barajador() {
		inicializar();
		this.coloresPilas = new ArrayList<Color>();
		this.primeraObtencion = true;
	}

	public void inicializar() {
		this.disponibilidad = Constantes.PETICION_BARAJAR_MAX;
	}

	public void cargarPilas(ArrayList<Pila> pilas) {
		assert pilas != null : "ArrayList de pilas nulo";

		for (int i = 0; i < pilas.size(); i++) {
			for (Color color : pilas.get(i).getPila()) {
				this.coloresPilas.add(color);
			}
		}
		
		this.mitadCantidadElementos = this.coloresPilas.size() / 2;
	}

	public void barajar() {
		for (int i = 0; i < this.MOVIMIENTOS_BARAJAR; i++) {
			this.coloresPilas.add(this.coloresPilas.remove(Utiles.generarNumeroAleatorio(0, this.coloresPilas.size())));
		}
	}
	
	private Stack<Color> obtenerPila(Stack<Color> pila, int cantidadElementos) {
		for (int i = 0; i < cantidadElementos; i++) {
			pila.add(this.coloresPilas.remove(0));
		}

		return pila;
	}

	public Stack<Color> obtenerPila() {
		Stack<Color> pila = new Stack<>();

		if (this.primeraObtencion) {
			this.primeraObtencion = false;
			return obtenerPila(pila, this.mitadCantidadElementos);
		} else {
			this.primeraObtencion = true;
			return obtenerPila(pila, this.coloresPilas.size());
		}
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

	public String getDisponibilidadString() {
		return String.valueOf(this.disponibilidad);
	}
}
