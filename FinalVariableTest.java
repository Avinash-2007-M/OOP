package avinash;

public class FinalVariableTest {
    public static void main(String[] args) {
        final int number = 10;
        number = 20; // Attempt to modify a final variable
        System.out.println("Number = " + number);
    }
}

/* ERROR
 FinalVariableTest.java:4: error: cannot assign a value to final variable 'number'
        number = 20;
        ^

 */
