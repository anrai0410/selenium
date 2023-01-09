package aditya;

import java.util.Scanner;

public class StudentPassingmarks {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		System.out.println("Please enter student marks");
		int marks=ad.nextInt();
		
		if (marks>=0 && marks<40)
		System.out.println("sorry Student is failed");
		else if ( marks>=40 && marks<50)
		{
			System.out.println("Student is pass");
		}
		else if (marks>=50 && marks<60)
		{
			System.out.println("Student is pass with second class");
		}
		else if (marks>=60 && marks<70)
		{
			System.out.println("Student is pass with first class");
		}
		else if (marks>=70 && marks <=100)
		{
			System.out.println("pass with distinction");
		}
		else 
		{
			System.out.println("invalid marks");
		}
	}

}
