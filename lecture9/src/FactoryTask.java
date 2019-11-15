class FactoryTask {

	String name;
	String location;
	int workerAmount;
	boolean isBankrupt = false;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	int getWorkerAmount() {
		return workerAmount;
	}

	boolean isBankrupt() {
		return isBankrupt;
	}

	void hireNewWorker(String employeePosition) {
		if (!this.isBankrupt) {
			this.workerAmount++;
			System.out.println("Hired new employee " + employeePosition
					+ " now there are " + this.workerAmount + " workers");
		} else {
			System.out.println(this.name
					+ " factory  is bankrupt. You cannot hire new workers");
		}
	}

	void fireWorker() {
		if (workerAmount > 0) {
			this.workerAmount--;
			System.out.println("There are now " + this.workerAmount
					+ " workers working there.");
		} else {
			System.out.println("There are no workers at the " + this.name
					+ " at this time. There is no one to fire.");
		}
	}

	void fireAll() {
		this.workerAmount = 0;
		System.out.println("There are no workers working there.");
	}

	void bankrupt() {
		this.fireAll();
		System.out.println(this.name + " is bankrupt.");
		this.isBankrupt = true;
	}

	void printStatus() {
		System.out.println("The name of the factory is " + this.name
				+ " located in " + this.location + " has " + this.workerAmount
				+ " workers ");
	}

	public static void main(String[] args) {
		FactoryTask factory = new FactoryTask();
		factory.setName("VEF");
		factory.setLocation("Riga");
//		factory.printStatus();
		
		factory.hireNewWorker("Engineer");
		factory.hireNewWorker("Manager"); 
		factory.fireAll(); 
		factory.printStatus();


	}
}
