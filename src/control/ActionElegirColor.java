package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ActionElegirColor implements ActionListener {
	
	private ParaUI paraUI;

	public ActionElegirColor(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.getAccionesParaUI().realizarJugada(((JButton) e.getSource()).getBackground());
		this.paraUI.getContentPane().updateUI();
	}

}
