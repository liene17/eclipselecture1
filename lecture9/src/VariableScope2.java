
public class VariableScope2 {
	int x = 11;
	int y = 22; 
	
	public void method1(int x){
		this.x = 88;
		y = 44; 
		System.out.println("this.x: " + this.x);
		System.out.println("x: " + x);
		System.out.println("this.y: " + this.y);
		System.out.println("y: " + y);
	}

	public static void main(String[] args) {
		VariableScope2 tvariableScope2 = new VariableScope2();
		tvariableScope2.method1(5);

	}

}
