package program;




/* This class verifies tge sizes*/
public class DrinkMachine {
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	public static final double OFFSET = 10.0;
	private double volume; // (ml)
	private String size; // "small", "medium", "large"

	/*DrinkMachine constructor without parameters */
	public DrinkMachine() {
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
	}

	/*DrinkMachine constructor with parameters */
	public DrinkMachine(double volume, String size) {
		this.volume = volume;
		this.size = size;
	}

	/*getter for volume */
	public double getVolume() {
		return volume;
	}

	/*setter for volume */
	public void setVolume(double volume) {
		this.volume = volume;
	}

	/*getter for size  */
	public String getSize() {
		return size;
	}

	/*setter for size */
	public void setSize(String size) {
		this.size = size;
	}

	/*This method verifies the sizes*/
	public String verifySize() {
		String report = "";
		boolean withTolerance = false;
		double	difference = 0;
		String tolerance ="";
		boolean sizeIsValid = true;

		if (size.equals(SMALL)  ) {
			difference = Math.abs(SMALL_VOLUME - volume);
		}
		else if (size.equals(MEDIUM)  ) {
			difference = Math.abs(MEDIUM_VOLUME - volume);

		}
		else if (size.equals(LARGE)) {
			difference = Math.abs(LARGE_VOLUME - volume);
		}
		else {
			sizeIsValid = false;
			tolerance = "invalid size or volume";
			difference = 0;
		}
		if (difference > 10.0 && sizeIsValid) {
			tolerance = "outside tolerance of 10.0 ml";
		}

		if (difference <= 10.0 && sizeIsValid) {
			tolerance = "within tolerance of 10.0 ml";
		}
		report = String.format( "Size is " + size + ", volume is " + volume + ", difference is " + difference + ", " + tolerance + " \nProgram by Zubair Hashi");

		System.out.println(report);

		return report;
	}
	/*This method displays the different drink size options*/
	public String drinkSizeMenu() {
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME,
				DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME 
				);			
		System.out.println(report);
		System.out.println("drink sizes are case-sensitive");
		return report;
	}
}
