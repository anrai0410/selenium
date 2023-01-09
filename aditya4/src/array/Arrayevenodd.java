package array;

public class Arrayevenodd {

	public static void main(String[] args) {
		
	int [] a= {11,12,16,77,56,85,94,8754,4563,756985};
	for ( int i=0; i<a.length; i++)
		if (a[i]%2==0)
			System.out.println(a[i]+ "  even no");
	else 
		System.out.println(a[i]+ "  odd no");
			

	}

}
 