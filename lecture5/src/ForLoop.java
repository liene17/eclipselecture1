import java.util.Scanner;


public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times shoudl I repeat?");
		int iteration = scanner.nextInt();
		
		for(int i = 0; i< iteration; i++){
			System.out.println("Repeat " + i);
			
		}

	}

}
