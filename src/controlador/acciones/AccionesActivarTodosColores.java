package controlador.acciones;

import controlador.ParaUI;
import modelo.Colores;
import utiles.Constantes;

public class AccionesActivarTodosColores {
	
	private ParaUI paraUI;
	
	public AccionesActivarTodosColores(ParaUI paraUI) {
		this.paraUI = paraUI;
	}
	
	public void generarTodosColores() {
		this.paraUI.getEstructura().getSeleccionadorTodosColores().activar();
		this.paraUI.getEstructura().getPaletaDeColores().limpiar();
		
		for (int i = 0; i < Constantes.PETICION_COLOR_MAX; i++) {
			this.paraUI.getEstructura().getPaletaDeColores().agregar(Colores.getElement(i));
		}
		
		this.paraUI.getEstructura().getSeleccionadorTodosColores().decrementarDisponibilidad();
	}
	
	public void actualizarRotuloPaleta() {
		this.paraUI.getBotones().getPaletaDeColores().getLabelPanelColores().setText("SELECCIONE CUALQUIER COLOR DE LOS DISPONIBLES");
	}
}
