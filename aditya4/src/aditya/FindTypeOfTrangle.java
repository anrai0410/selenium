package aditya;

import java.util.Scanner;

public class FindTypeOfTrangle {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int a=ad.nextInt();
		int b=ad.nextInt();
		int c=ad.nextInt();
		System.out.println("please give all three angle and verify sum of all angle is not more than 180");
		
		
			if(a+b+c==180 && a>0 &&b>0 &&c>0)
	      {
			if (a==b && b==c)
				System.out.println("equilateral triangle");
			if (a!=b &&b!=c && c!=a)
				System.out.println("scalene triangle");
			if (a==90|| b==90||c==90)
				System.out.println("right angle triangle");
			if ((a==b && b!=c)|| (b==c && c!=a) || (c==a && a!=b))
				System.out.println("isoceles triangle");
	      }
			else 
				System.out.println("this is not triangle");
	
		}

	}


