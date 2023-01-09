package aditya;

import java.util.Scanner;

public class Print_the_star_pattern {

	public static void main(String[] args) {
	Scanner ad=new Scanner(System.in);
	int m=ad.nextInt();
	int n=ad.nextInt();
     for (int i=1; i<=m; i++) {
		for (int j=1; j<=n; j++) 
	{
	System.out.print("*");
	}
		System.out.println();
	}
	}

}
