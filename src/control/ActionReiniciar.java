package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionReiniciar implements ActionListener {
	
	private ParaUI paraUI;

	public ActionReiniciar(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.reiniciar();
	}

}
