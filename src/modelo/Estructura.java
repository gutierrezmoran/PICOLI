package modelo;

import java.awt.Color;
import java.util.AbstractCollection;
import java.util.ArrayList;

import modelo.comodines.Barajador;
import modelo.comodines.Borrador;
import modelo.comodines.SeleccionadorTodosColores;
import utiles.Constantes;
import utiles.Utiles;

public class Estructura {

	private Cola cola;
	private ArrayList<Pila> pilas;
	private Lista lista;
	private Monedero monedero;
	private HistorialColores historialColores;
	private PaletaDeColores paletaDeColores;
	private Borrador borrador;
	private SeleccionadorTodosColores seleccionadorTodosColores;
	private Barajador barajador;

	public Estructura() {
		this.cola = new Cola();
		this.pilas = new ArrayList<>();
		this.lista = new Lista(this);
		this.monedero = new Monedero();
		this.borrador = new Borrador(this);
		this.seleccionadorTodosColores = new SeleccionadorTodosColores();
		this.barajador = new Barajador();
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
		this.monedero.reiniciar();
		this.historialColores.limpiar();
		this.paletaDeColores.limpiar();
		this.borrador.inicializar();
		this.seleccionadorTodosColores.inicializar();
		this.barajador.inicializar();
		reiniciarPilas();
	}

	private void reiniciarPilas() {
		this.pilas.clear();
		inicializarPilas();
	}

	private void inicializarPilas() {
		for (int i = 0; i < Constantes.CANTIDAD_PILAS; i++) {
			this.pilas.add(new Pila());
		}
	}
	
	public boolean isPilasVacias() {
		return this.pilas.get(0).isVacia() && this.pilas.get(1).isVacia();
	}

	public boolean realizarJugada(Color color) {
		assert (color != null) : "El color es nulo";

		this.cola.encolar(color);
		this.historialColores.actualizar(color);
		
		int pilaSeleccionada = getIndicePilaAleatoria();
		if (isColeccionLlena(this.pilas.get(pilaSeleccionada).getPila(), Constantes.TAMANO_PILA)) {
			this.lista.alistar(this.pilas.get(pilaSeleccionada).desapilar());
		}
		this.pilas.get(pilaSeleccionada).apilar(this.cola.desencolar());

		if (this.lista.borrarColoresRepetidos()
				|| isColeccionLlena(this.lista.getLista(), Constantes.TAMANO_LISTA)) {
			return true;
		}

		return false;
	}
	
	public boolean barajarPilas() {
		this.barajador.cargarPilas(this.pilas);
		this.barajador.barajar();

		for (int i = 0; i < this.pilas.size(); i++) {
			this.pilas.get(i).setPila(this.barajador.obtenerPila());
		}
		this.barajador.decrementarDisponibilidad();
		return this.barajador.comprobarVecesUsado();
	}

	private int getIndicePilaAleatoria() {
		int numero = Utiles.generarNumeroAleatorio(0, 2);
		if (isColeccionLlena(this.pilas.get(numero).getPila(), Constantes.TAMANO_PILA)) {
			return ((numero + 1) % 2);
		} else {
			return numero;
		}

	}

	public boolean isColeccionLlena(AbstractCollection<Color> coleccion, int limite) {
		assert (coleccion != null) : "La coleccion es nula";
		assert (limite > 0) : "El limite es igual o inferior a 0";

		return coleccion.size() >= limite;

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

	public Monedero getMonedero() {
		return monedero;
	}

	public Borrador getBorradorColores() {
		return borrador;
	}

	public PaletaDeColores getPaletaDeColores() {
		return paletaDeColores;
	}

	public boolean isTesoroLleno() {
		return monedero.isLleno();
	}

	public int getMonedasInt() {
		return monedero.getMonedasInt();
	}
	
	public String getMonedasString() {
		return monedero.getMonedasString();
	}

	public boolean isListaVacia() {
		return lista.isListaVacia();
	}

	public SeleccionadorTodosColores getSeleccionadorTodosColores() {
		return seleccionadorTodosColores;
	}

	public Barajador getBarajadorPilas() {
		return barajador;
	}

	public boolean isDesactivadoSeleccionadorTodosColores() {
		return seleccionadorTodosColores.isDesactivado();
	}

	public void activarSeleccionadorTodosColores() {
		seleccionadorTodosColores.activar();
	}

	public void desactivarSeleccionadorTodosColores() {
		seleccionadorTodosColores.desactivar();
	}

}
