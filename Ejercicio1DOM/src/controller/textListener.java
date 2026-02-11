package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

		if (e.getSource() == window.getButtons().get(0).getText()) {
			
			
		}
		else if (e.getSource() == window.getButtons().get(1).getText()) {
			
		}
		else if (e.getSource() == window.getButtons().get(2).getText()) {
			
		}
		else {}
	}
}
