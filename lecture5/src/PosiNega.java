
import java.util.Scanner;


public class PosiNega {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the number?");
		double input = scanner.nextDouble();
		
	if(input >= 0){
		System.out.println("Number " + input + " is positive");
		
	}else if(input <0){
		System.out.println("Number " + input + "is negative");
		
	}

	}

}
