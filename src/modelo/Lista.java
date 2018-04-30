package modelo;

import java.awt.Color;
import java.util.ArrayList;

public class Lista extends ArrayList<Color> {

	private Estructura estructura;
	private ArrayList<Color> lista;

	public Lista(Estructura estructura) {
		this.lista = new ArrayList<Color>();
		this.estructura = estructura;
	}

	public ArrayList<Color> getLista() {
		return lista;
	}

	public void alistar(Color color) {
		assert color != null : "El color es nulo";
		
		lista.add(color);
	}
	
	public void desalistar(Color color) {
		this.lista.remove(color);
	}

	private void desalistarRepetidos(int posicion) {
		assert posicion >= 0 : "La posicion es inferior a 0";
		
		for (int i = 0; i < 2; i++) {
			this.lista.remove(posicion);
		}
	}

	public boolean comprobarColoresIguales(Color color1, Color color2) {
		assert (color1 != null && color2 != null) : "Alguno de los colores es nulo";

		return color1 == color2;
	}
	
	private boolean haveColoresIgualesContiguos() {
		for (int i = 0; i < this.lista.size() - 1; i++) {
			if (comprobarColoresIguales(this.lista.get(i), this.lista.get(i + 1))) {
				return true;
			}
		}
		return false;
	}
	
	private int getIndiceColorIgualContiguo() {
		int indice = 0;
		for (int i = 0; i < this.lista.size() - 1; i++) {
			if (comprobarColoresIguales(this.lista.get(i), this.lista.get(i + 1))) {
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	public boolean borrarColoresRepetidos() {
		while (haveColoresIgualesContiguos()) {
			desalistarRepetidos(getIndiceColorIgualContiguo());
			this.estructura.getMonedero().incrementar();
			if (this.estructura.isTesoroLleno()) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isListaVacia() {
		return this.lista.isEmpty();
	}

	public void reiniciar() {
		this.lista.clear();
	}

	public Estructura getParaUI() {
		return estructura;
	}

}
