import java.util.Scanner;

public class ArrayTask2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What day is it?");
		int number = scanner.nextInt();
		String[] daynumber = {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if(number < 0 || number > 7){
			System.out.println("Incorrect");
		}else{
		System.out.println(daynumber[number -1]);
		

	}

}
}