package controlador.eventos.comodines;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.ParaUI;

public class ActionBarajarPilas implements ActionListener {
	
	private ParaUI paraUI;
	
	public ActionBarajarPilas(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!this.paraUI.getEstructura().isPilasVacias()) {
			this.paraUI.getAccionesBarajarPilas().barajar();
		}
	}

}
