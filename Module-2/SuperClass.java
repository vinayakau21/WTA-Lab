class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }

	int maxSpeed = 120;

    void rev() {
        System.out.println("Vehicle reving...");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car constructor");
    }
	int maxSpeed = 180;

	void display()
	{
		System.out.println("Maximum Speed: " + super.maxSpeed);
        rev();
        super.rev();
	}

    void rev() {
        System.out.println("Car reving...");
    }
}

class SuperClass {
	public static void main(String[] args)
	{
		Car c = new Car();
		c.display();
	}
}
