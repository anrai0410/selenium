package aditya;
import java.util.*;
public class Invertedhalfpyramid {

	public static void main(String[] args) {
	Scanner ad=new Scanner(System.in);
			int m=ad.nextInt();
			for (int i=1; i<=m; i++)
			{ for (int j=1; j<=m-i; j++);{
				System.out.println(" "); 
			}
	for ( int j=1;j<=i; j++) { 
		System.out.println("*");
	}
System.out.println();}
}
}