package control;

import modelo.Colores;
import modelo.Estructura;
import vista.UI;

public class ParaUI extends UI {

	private Estructura control = new Estructura();
	
	public ParaUI() {
		inicializarCola();
	}
	
	public void inicializarCola() {
		int i = 0;
		for(Colores color : this.control.getCola().getCola()) {
			cola.agregarColor(color, i);
			i++;
		}
	}
}
