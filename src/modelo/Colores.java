package modelo;

import java.awt.Color;

public enum Colores {
	
	rojo(new Color(255, 51, 51), "ROJO"), amarillo(new Color(255, 255, 51), "AMARILLO"), azul(new Color(51, 131, 255), "AZUL"), verde(new Color(38, 190, 87),
			"VERDE"), naranja(new Color(228, 193, 0), "NARANJA");

	private Color color;
	private String nombre;

	private Colores(Color color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}

	public Color getColor() {
		return color;
	}

	public String getNombre() {
		return nombre;
	}

	public static int getCantidadElementos() {
		return Colores.values().length;
	}

	public static Color getElement(int i) {
		return Colores.values()[i].getColor();
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}
