import java.util.ArrayList;
import java.util.Scanner;


public class loophomework {

	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("enter 5 numbers, press enter after each one, then type done");
		while (input.hasNextInt()) {
			myNumbers.add(input.nextInt());	
		}
		
		int sum = 0;
		for(int i = 0; i < myNumbers.size(); i++)
		{
			sum += myNumbers.get(i);
		}
		
		int product = 1;
		for(int i = 0; i < myNumbers.size(); i++)
		{
			product = product * myNumbers.get(i);
		}
		
		int min = myNumbers.get(0);
		for (int i = 1; i < myNumbers.size(); i++) {
            if (myNumbers.get(i) < min) {
                min = myNumbers.get(i);
            }
        }
		
		int max = myNumbers.get(0);
		for (int i = 1; i < myNumbers.size(); i++) {
            if (myNumbers.get(i) > max) {
                max = myNumbers.get(i);
            }
        }
  
		System.out.println(sum);
		System.out.println(product);
		System.out.println(min);
		System.out.println(max);

	}

}
