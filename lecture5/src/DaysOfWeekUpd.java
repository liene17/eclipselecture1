import java.util.Scanner;


public class DaysOfWeekUpd {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What day is it?");
		
		
		int dayIndex = scanner.nextInt();
	
		
		if(dayIndex ==1){
			System.out.println("Monday");
		}else if(dayIndex == 2){
			System.out.println("Tuesday");
		}else{
			System.out.println("Another day");
		}

	}

}
