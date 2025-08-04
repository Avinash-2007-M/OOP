package Practical;

	// Parent class
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Child class
	class Lion extends Animal {
	    void roar() {
	        System.out.println("The lion roars.");
	    }
	}

	// Main
	public class SingleInheritance {
	    public static void main(String[] args) {
	        Lion klion = new Lion();
	        klion.eat();   // inherited method
	        klion.roar();  // lion-specific method
	    }
	}


