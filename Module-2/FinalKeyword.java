// Final variables: When a variable is declared as final, its value cannot be changed once it has been initialized. This is useful for declaring constants or other values that should not be modified.
// Final methods: When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class’s public API and should not be modified by subclasses.
// Final classes: When a class is declared as final, it cannot be extended by a subclass. This is useful for classes that are intended to be used as is and should not be modified or extended.

public class FinalKeyword {
	public static void main(String[] args) {
		final int VALUE = 10; // declaring a final variable
		
		System.out.println("The value is: " + VALUE);
		// VALUE = 20; // uncommenting this line will cause a compiler error
		
		MyClass myObj = new MyClass();
		myObj.printMessage();
		myObj.printFinalMessage();
	}
}

class MyClass {
	final String message = "Hello!"; // declaring a final instance variable
	
	void printMessage() {
		System.out.println(message);
	}
	
	void printFinalMessage() {
		final String finalMessage = "Hello, final!";
		System.out.println(finalMessage);
	}
}

final class MyOtherClass { // declaring a final class
	// ...
}

// MyOtherClass extends MyClass {} // uncommenting this line will cause a compiler error

