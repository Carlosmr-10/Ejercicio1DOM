package controller;

import java.awt.event.*;

import javax.swing.JButton;

import model.Data;
import view.MainWindow;

public class textListener implements KeyListener {

	private MainWindow window;
	private Data data;
	
	public textListener(MainWindow window, Data data) {
		
		this.window = window;
		this.data = data;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {

		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		if (e.getKeyCode() == Integer.parseInt(window.getButtons().get(0).getText())) {
			
			window.getButtons().add(new JButton("1"));
		}
		else if (e.getKeyCode() == Integer.parseInt(window.getButtons().get(1).getText())) {

			window.getButtons().add(new JButton("2"));
		}
		else if (e.getKeyCode() == Integer.parseInt(window.getButtons().get(2).getText())) {

			window.getButtons().add(new JButton("3"));
		}
		else {}
	}
}
