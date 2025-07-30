package mypackage;
import java.util.*;
public class Student_Details {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String a = sc.nextLine();
		System.out.println("Enter the roll number");
		long roll = sc.nextLong();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the gender(M/F)");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the percentage: ");
		int percentage = sc.nextInt();
        
		System.out.println("Entered name is: "+a);
		System.out.println("Entered roll number is: "+roll);
		System.out.println("Entered age is: "+age);
		System.out.println("Entered gender is: "+gender);
		System.out.println("Entered percentage is: "+percentage);
		sc.close();
		
	}

}
