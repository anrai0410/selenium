package aditya;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner ad=new Scanner(System.in);
	int  button=ad.nextInt();
	
	switch(button) {
	case 1 : System.out.println("hello");
	break;
	case 2 : System.out.println("namaste");
	break;
	case 3 : System.out.println("pranam");
	break;
	default : System.out.println("invalid");
	}

	}

}
