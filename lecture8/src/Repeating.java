class Car {
	String color;
	int speed;
	String name;

	void drive() {
		System.out.println("Drive " + this.name);
	}

	String driveOnASpecificLight(int speed, String light) {
		return "Driving on " + light + " with speed " + speed;
	}

	String someStuff = "jh";

	String someStuffsSize(boolean small, double size, String someStuff) {
		return "This stuff " + this.someStuff + "is" + small
				+ "and the size is " + size;
	}
}

public class Repeating {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.name = "My Car";
		myCar.drive();
		myCar.someStuffsSize(false, 2.3, "jh");

		String msg = myCar.driveOnASpecificLight(56, "red");
		System.out.println(msg);

		Car stolenCar = new Car();
		stolenCar.name = "Stolen Car";
		stolenCar.drive();
	}

}
