package mypackage;
import java.util.*;

class Student {
	String name;
	int Rollno;
	int[] marks;

	void setter(String name, int Rollno, int[] marks) {
		this.name = name;
		this.Rollno = Rollno;
		this.marks = marks;
	}

	void getter() {
		System.out.println("\n--- Student Details ---");
		System.out.println("Name     : " + name);
		System.out.println("Roll No  : " + Rollno);
		System.out.println("Marks    : ");
		for (int m : marks) {
			System.out.print(m + " ");
		}
		System.out.println("\nAverage  : " + getAverage());
		System.out.println("Grade    : " + getGrade());
	}

	double getAverage() {
		int sum = 0;
		for (int m : marks) {
			sum += m;
		}
		return marks.length > 0 ? (double) sum / marks.length : 0.0;
	}

	String getGrade() {
		double avg = getAverage();
		if (avg >= 90) return "A+";
		else if (avg >= 80) return "A";
		else if (avg >= 70) return "B";
		else if (avg >= 60) return "C";
		else if (avg >= 50) return "D";
		else return "F";
	}
}

public class Practical1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of Student: ");
		String name = sc.next();

		System.out.println("Enter Rollno of Student: ");
		int Rollno = sc.nextInt();

		System.out.print("Enter number of subjects: ");
		int n = sc.nextInt();
		int[] marks = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter mark for subject " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
		}

		Student st = new Student();
		st.setter(name, Rollno, marks);
		st.getter();

		sc.close();
	}
}
