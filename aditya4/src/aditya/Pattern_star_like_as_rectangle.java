package aditya;
import java.util.*;
public class Pattern_star_like_as_rectangle {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int m=ad.nextInt();
		int n=ad.nextInt(); 
		//for(int i=1; i<=n; i++) 
		//{
	//	for(int j=1; j<=m; j++) {
	//			System.out.print("*");
	//	}System.out.println(); 
			//outer loop
			for (int i=1; i<=m; i++) {
				//inner loop 
				for (int j=1; j<=n; j++) {
					//cell -> (i,j)
					if (i==1|| j==1|| i==m|| j==m ) {
				System.out.print("*");
				} else {System.out.print(" ");
				}
				}
					
			}
				System.out.println();
			
		}
			
	}

