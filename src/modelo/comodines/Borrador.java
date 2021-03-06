package modelo.comodines;

import java.awt.Color;
import java.util.Iterator;
import modelo.Estructura;
import utiles.Constantes;

public class Borrador {

	private Estructura estructura;
	private int disponibilidad;

	public Borrador(Estructura estructura) {
		inicializar();
		this.estructura = estructura;
	}
	
	public void inicializar() {
		this.disponibilidad = Constantes.PETICION_BORRAR_MAX;
	}

	public boolean borrarColor(Color color) {
		assert (color != null) : "El color es nulo";
		for (Iterator<Color> iterator = this.estructura.getLista().getLista().iterator(); iterator.hasNext();) {
			Color colorLista = iterator.next();
			if (this.estructura.getLista().comprobarColoresIguales(colorLista, color)) {
				iterator.remove();
				this.estructura.getMonedero().incrementar(1);
			}
		}
		
		decrementarDisponibilidad();
		return comprobarVecesUsado();
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
