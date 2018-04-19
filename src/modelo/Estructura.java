package modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

import utiles.Constantes;
import utiles.Utiles;

public class Estructura {
private Cola cola;
private ArrayList<Pila> Pilas;
private Lista lista;


public Estructura(Cola cola, ArrayList<Pila> pilas, Lista lista) {
	this.cola = cola;
	Pilas = pilas;
	this.lista = lista;
}

public Cola getCola() {
	return cola;
}

public ArrayList<Pila> getPilas() {
	return Pilas;
}
public Lista getLista() {
	return lista;
}

public void inicializarCola() {
	for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			cola.encolar(Colores.getElement(Utiles.generrNumeroAleatorio()));
	}
}
	
}
