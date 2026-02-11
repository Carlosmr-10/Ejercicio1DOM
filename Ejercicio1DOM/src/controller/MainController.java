package controller;

import model.Data;
import view.MainWindow;

public class MainController {
	
	private Data data;
	private MainWindow window;

	public MainController() {
		
		
		data = new Data();
		window = new MainWindow(data);
	}
}
