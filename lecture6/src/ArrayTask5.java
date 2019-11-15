import java.util.Scanner;


public class ArrayTask5 {
	
	public static void main(String[] args) {
		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter searched value");
		int searchedValue = scanner.nextInt(); 
		
		boolean isValueFound = false;
		
		for(int value : myArray){
			if(value == searchedValue){
				isValueFound = true;
				break;
				
			}
		}
		if(isValueFound){
			System.out.println("Searched value "+ searchedValue +" is found");
		}else{
			System.out.println("Searched value "+ searchedValue +" is not found");
		}
		

	}

}
