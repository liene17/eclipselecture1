class User {
	String name;
	int age;
	boolean man;
	String hairColor; 
	
	void sayHi() {
		System.out.println("Hi, my name is " + name + " I'm " + age
				+ " old " + "and my hair is " + hairColor);
	}
}

public class App {

	public static void main(String[] args) {
		String name = "John";
		int age = 30;
		boolean man = false;
		String hairColor = "brown";
		
		String name1 = "Marta";
		int age2 = 12;
		boolean man2 = true;
		String hairColor2 = "blond"; 
		
		User john = new User();
		john.name = "John";
		john.age = 30;
		john.man = true;
		john.hairColor = "brown"; 
		john.sayHi(); 
		
		User marta = new User();
		marta.name = "Marta";
		marta.age = 12;
		marta.man = false;
		marta.hairColor = "blond"; 
		marta.sayHi(); 
		
		User santa = new User();
		santa.name = "Santa";
		santa.age = 22;
		santa.man = false;
		santa.hairColor = "red";
		santa.sayHi(); 

	}

}
