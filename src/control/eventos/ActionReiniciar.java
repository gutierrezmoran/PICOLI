package control.eventos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import control.ParaUI;

public class ActionReiniciar implements MouseListener {
	
	private ParaUI paraUI;
	private Color color;
	private final int oscurecer = 20;

	public ActionReiniciar(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.paraUI.reiniciar();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.color = ((JButton)e.getSource()).getBackground();
		((JButton)e.getSource()).setBackground(new Color(this.color.getRed() - oscurecer, this.color.getGreen() - oscurecer, this.color.getBlue() - oscurecer));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JButton)e.getSource()).setBackground(this.color);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
