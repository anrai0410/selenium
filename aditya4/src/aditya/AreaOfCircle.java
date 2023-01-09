package aditya;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int r=ad.nextInt();
		
		 double area= Math.PI*(r*r);
		
		System.out.println("area of circle is" + area);

	}

}
