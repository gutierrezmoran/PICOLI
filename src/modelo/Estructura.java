package modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

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

}
