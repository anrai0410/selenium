package aditya;

import java.util.Scanner;

public class Outerboundaryimage {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int m=ad.nextInt();
		int n=ad.nextInt();
		//outer loop
	     for (int i=1; i<=n; i++) {
	    	 //inner loop
			for (int j=1; j<=m; j++) 
				//cell->(i,j)
				if (i==1 || j==1|| i==n||j==m)
		{
		System.out.print("*");
		}else 
		{System.out.print(" ");}
			System.out.println();
		
		}

	}

}
