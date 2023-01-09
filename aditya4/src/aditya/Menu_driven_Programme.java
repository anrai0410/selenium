package aditya;
import java.util.*;
public class Menu_driven_Programme {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		
		
	int button=ad.nextInt();
	if (button==0) {
		System.out.println("system out");}
	else if (button==1) {
		System.out.println(" Please enter your marks");
		Scanner m=new Scanner(System.in);
		int marks=m.nextInt();
	switch(marks) {
	case 100 :System.out.println("This is good");
	break;
	case 89-60 : System.out.println("This is also good");
	break;
	default : System.out.println("invalid marks");
	}
	
		
	}else System.out.println("invalid number please us only o and 1");
		
	
	}
	
	
	}
		
	
	


