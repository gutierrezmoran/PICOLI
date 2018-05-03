package controlador.eventos.comodines;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import controlador.ParaUI;

public class ActionBorrarColor implements MouseListener {

	private ParaUI paraUI;
	private Border border;

	public ActionBorrarColor(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(this.paraUI.getAccionesBorrarColor().borrarColor(((JButton) e.getSource()).getBackground())) {
			this.paraUI.crearMenu(this.paraUI.getEstructura().isTesoroLleno(), this.paraUI.getEstructura().getMonedasString());
			this.paraUI.getContentPane().updateUI();
			this.paraUI.establecerListenerReiniciar();
		} else {
			this.paraUI.getAccionesEstructura().actualizarRotuloPaleta();
			this.paraUI.getAccionesEstructura().actualizarUI();
			this.paraUI.establecerListenerElegirColor();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.border = ((JButton) e.getSource()).getBorder();
		((JButton) e.getSource()).setBorder(new LineBorder(Color.BLACK));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JButton) e.getSource()).setBorder(this.border);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
