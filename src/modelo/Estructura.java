package modelo;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import control.Comprobador;
import utiles.Constantes;
import utiles.Utiles;

public class Estructura {
	private Cola cola;
	private ArrayList<Pila> pilas;
	private Lista lista;

	public Estructura() {
		this.cola = new Cola();
		this.pilas = new ArrayList<>();
		this.lista = new Lista();
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
			cola.encolar(Colores.getElement(Utiles.generarNumeroAleatorio(0, 5)));
		}

	}
	public void realizarJugada(Colores color) {
		this.cola.encolar(color);
		Pila pilaSeleccionada = getPilaAleatoria();
		pilaSeleccionada.apilar(this.cola.desencolar());
		if (Comprobador.isColeccionLlena(pilaSeleccionada, Constantes.TAMANO_PILA)) {
			this.lista.alistar(pilaSeleccionada.pop());
		} 
	}
	private Pila getPilaAleatoria(){
		int numero=Utiles.generarNumeroAleatorio(0, 1);
		if (Comprobador.isColeccionLlena(this.pilas.get(numero), Constantes.TAMANO_PILA)) {
			if (numero==0) {
				return this.pilas.get(1);
			}else {
				return this.pilas.get(0);
			}
		}else {
			return this.pilas.get(numero);
		}
		
	}

}
