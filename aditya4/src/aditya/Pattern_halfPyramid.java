package aditya;
import java.util.*;
public class Pattern_halfPyramid {

	public static void main(String[] args) {
		 Scanner ad=new Scanner(System.in);
		  int m=ad.nextInt();
//		  outer loop
		  for(int i=1;i<=m; i++) {
//		  inner loop
		  for (int j=1; j<=i; j++){
			 System.out.print("*");
		 }
		  System.out.println();
		  } 
	}

}
