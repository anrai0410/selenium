package aditya;

import java.util.Scanner;

public class Condition1_greater_smaller_equqal {

	public static void main(String[] args) {
		
			Scanner ad=new Scanner(System.in);
			int a= ad.nextInt();
			int b= ad.nextInt();
			
			if(a==b) {
				System.out.println("equal");
				
			} else if (a>b){
				System.out.println("a is greater");
			} else {
				System.out.println("a is lesser");
			}

		}

	}


