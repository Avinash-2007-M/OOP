package avinash;
import java.util.*;
public class Average_of_Three_Numbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("Average is: "+avg);
		sc.close();
	}

}
