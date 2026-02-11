package controller;

import model.Data;
import view.MainWindow;

public class MainController {

	public MainController() {
		
		Data data = new Data();
		MainWindow window = new MainWindow(data);
		
		window.getTextField().addKeyListener(new textListener(window, data));
	}
}
