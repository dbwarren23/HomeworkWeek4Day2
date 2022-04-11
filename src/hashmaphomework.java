import java.util.Scanner;
import java.util.HashMap;

public class hashmaphomework {

	public static void main(String[] args) {
		HashMap<String, String> carModels = new HashMap<String, String>();
		// adding keys and values (Make, Model)
		carModels.put("Honda", "Civic");
		carModels.put("Toyota", "Corolla");
		carModels.put("Ford", "Focus");
		carModels.put("Hyundai", "Elantra");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to TTS Honda/Toyota/Ford/Hyundai"
				+ "please input which of our 4 brands you are interested in"
				+ "to view our in-stock selection");
		String brand = input.nextLine();
		System.out.println(carModels.get(brand));
	}

}
