package Practical;

//Superclass
class Vehicle {
 void move() {
     System.out.println("The vehicle moves.");
 }
}

//Subclass
class Car extends Vehicle {
 void fuelType() {
     System.out.println("The car uses petrol or diesel.");
 }
}

//Main
public class SingleInheritance2 {
 public static void main(String[] args) {
     Car mycar = new Car();
     mycar.move();      // inherited method
     mycar.fuelType();  // car-specific method
 }
}
