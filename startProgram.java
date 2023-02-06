package program;

import java.util.Scanner;



/* This class determines if the machine needs maintenance or not*/
public class startProgram {

	/* This method is the entry point for the application which determines if the machine needs maintenance or not */
	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine();
		User user = new User();
		Scanner scan = new Scanner(System.in);
		String shouldContinue = "yes";
		
		while(shouldContinue.equalsIgnoreCase("yes")) {
		machine.drinkSizeMenu();
		String size = user.inputString("Enter size (small, medium, or large): \n"); 
		machine.setSize(size);
		double volume = user.inputDouble("Enter volume: \n");
		machine.setVolume(volume);	
		machine.verifySize();		
		
		shouldContinue = user.inputString("Continue Program (yes/no)?");
		}// end while
		System.out.println("Program has exited");	

	} //end main
}