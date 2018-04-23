package modelo;

import java.awt.Color;

public enum Colores {
	
	rojo(new Color(255, 51, 51), "rojo"), amarillo(new Color(255, 255, 51), "amarillo"), azul(new Color(51, 131, 255), "azul"), verde(new Color(38, 190, 87),
			"verde"), naranja(new Color(228, 193, 0), "naranja");

	private Color color;
	private String nombre;

	private Colores(Color color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}

	public Color getColor() {
		return color;
	}

	public static int getCantidadElementos() {
		return Colores.values().length;
	}

	public static Colores getElement(int i) {
		return Colores.values()[i];
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}
