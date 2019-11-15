
public class Conditions {

	public static void main(String[] args) {
		/*boolean isWithinTown = false;
		boolean isHighway = false;
		int maxSpeed;
		
		if (isWithinTown){
			maxSpeed = 50;
		}else if(isHighway){
			maxSpeed = 110;
		}else{
			maxSpeed = 90;
		}
		
		System.out.println("Max speed="+ maxSpeed);*/
		
		int a = 4;
		short b = 4;
		int c = 3;
		
		boolean b1 = a == b;
		boolean b2 = b != c;
		boolean b3 = a > c;
		
		if (b1 && b2 && b3) {
			System.out.println("Success!");
		}else{
			System.out.println("Something wrong");
		}
		
		

	}

}
