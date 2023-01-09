package aditya;
import java.util.*;
public class Calculatortwo {

	public static void main(String[] args) {
	Scanner ad=new Scanner(System.in);
	int a=ad.nextInt();
	int b=ad.nextInt();	
	int button=ad.nextInt();
	
	switch(button) {
	case 1 :System.out.println(a+b);
	break;
	case 2 :System.out.println(a-b);
	break;
	case 3 :System.out.println(a*b);
	break;
	case 4 :System.out.println(a/b);
	break;
	case 5 : System.out.println(a%b);
	break;
	default:System.out.println("invalid button");
	}
	
	}

}
