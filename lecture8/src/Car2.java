class myCar {
	private int maxSpeed;
	private String color;
	private String brand;

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getmaxSpeed() {
		return this.maxSpeed;
	}

	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

public class Car2 {

	public static void main(String[] args) {
		myCar car = new myCar();
		car.setBrand("Audi");
		String name = car.getBrand();
		System.out.println("I have an " + name);

		car.setColor("black");
		String color = car.getColor();
		System.out.println("its color is " + color);

		int maxSpeed = 250;
		System.out.println("its max speed is " + maxSpeed + "km/h");

	}

}
