package model;

import java.util.ArrayList;

public class Data {
	
	private ArrayList<Integer> numbers = new ArrayList<>();
	private ArrayList<String> texts = new ArrayList<>();
	
	/*
	 * Builder
	 */
	public Data() {
		
		generateTexts();
		generateNumbers();
	}

	/*
	 * Getters and setters
	 */
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public ArrayList<String> getTexts() {
		return texts;
	}

	public void setTexts(ArrayList<String> texts) {
		this.texts = texts;
	}

	/*
	 * Method to add texts to the code
	 */
	private void generateTexts() {
		
		texts.add(""); // 0
	}
	
	/*
	 * Method to add numbers to the code
	 */
	private void generateNumbers() {
		
		numbers.add(3); // 0
		numbers.add(1); // 1
	}
}
