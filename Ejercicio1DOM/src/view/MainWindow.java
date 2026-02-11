package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import model.Data;

public class MainWindow extends JFrame {

	private ArrayList<JPanel> panels = new ArrayList<>();
	private JTextField textField;
	private ArrayList<JButton> buttons = new ArrayList<>();

	public MainWindow(Data data) {

		createMainView(data);
		setProperties();
		pack();
	}

	public ArrayList<JPanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<JPanel> panels) {
		this.panels = panels;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

	private void createMainView(Data data) {

		panels.add(new JPanel());
		panels.add(new JPanel());
		textField = new JTextField(10);
		panels.get(0).add(textField);
		panels.get(1).setLayout(new GridLayout(1, 3));
		
		for (int i = 0; i < 3; i++) {

			buttons.add(new JButton("" + (i + 1)));
			panels.get(1).add(buttons.get(i));
		}

		panels.get(0).add(panels.get(1));
		add(panels.get(0));
	}

	private void setProperties() {

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
