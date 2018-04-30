package controlador.acciones;

import controlador.ParaUI;

public class AccionesBarajarPilas {

	private ParaUI paraUI;

	public AccionesBarajarPilas(ParaUI paraUI) {
		this.paraUI = paraUI;
	}
	
	public void barajar() {
		if(!this.paraUI.getEstructura().barajarPilas()) {
			this.paraUI.getBotones().getComodines().getBarajarPila().setEnabled(false);
		}
		
		this.paraUI.getAccionesParaUI().actualizarPilas();
		this.paraUI.getAccionesParaUI().actualizarBarajarPilas();
		this.paraUI.getContentPane().updateUI();
	}
}
