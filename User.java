package program;

/*
 * Student Name: Zubair Hashi
 * Lab Professor: Dave Houtman
 * Due Date: 19/11/2021
 * Description: Assignment 2 
 */
import java.util.Scanner;

/* This class has the input and output statements*/
public class User {

	private Scanner keyboard = new Scanner(System.in);
	/*method for inputInteger */
	public int inputInteger() {

		int value = 0;
		boolean isInvalid = false;
		while(isInvalid) {
			if (keyboard.hasNextInt()) {
				value = keyboard.nextInt();
				isInvalid = true;
			}
			keyboard.nextLine();
		}
		return value;
	}
	/*method for inputInteger with parameters */
	public int inputInteger(String message) {
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}

	/*method for inputDouble */
	public double inputDouble() {
		double value = 0.0;
		boolean isInvalid = true;
		while(isInvalid) {
			if (keyboard.hasNextDouble()) {
				value = keyboard.nextDouble();
				isInvalid = false;	
			}
			keyboard.nextLine();
		}
		return value;
	}

	/*method for inputDouble with parameters */
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	/*method for inputString */
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	/*method for inputString with parameters */	
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
}