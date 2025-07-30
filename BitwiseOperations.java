package avinash;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int leftShift = a << b;
        int rightShift = a >> b;

        System.out.println("\nBitwise Operation Results:");
        System.out.println("---------------------------");

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")\n");

        System.out.println("a & b = " + and + " (" + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (" + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (" + Integer.toBinaryString(xor) + ")");
        System.out.println("a << b = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");
        System.out.println("a >> b = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");
    }
}
