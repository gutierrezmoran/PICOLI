package control.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import control.ParaUI;

public class ActionElegirColor implements MouseListener {

	private ParaUI paraUI;
	private Border border;

	public ActionElegirColor(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.paraUI.getAccionesSeleccionarColor().seleccionarColor(((JButton) e.getSource()).getBackground());
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
