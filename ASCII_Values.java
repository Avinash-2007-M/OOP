package avinash;
import java.util.*;
public class ASCII_Values 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char a = sc.next().charAt(0);
		int ascii = a;
		System.out.println("ASCII value of "+a+" is "+ascii);
	}

}
