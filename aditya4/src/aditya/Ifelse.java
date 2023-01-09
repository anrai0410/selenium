package aditya;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
	Scanner ad=new Scanner(System.in);
	int button=ad.nextInt();
	
	if(button==1) {
		System.out.println("Hello");
		} else if (button==2) {
			System.out.println("namaste");
		}else if (button==3) {
			System.out.println("pranam");
		}else {
			System.out.println("invalid button");
	}
	}

}
