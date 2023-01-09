package array;

public class Twodarray_Double_2nd {

	public static void main(String[] args) {
		double [] [] d= { {11.2,14.2,87.2},	
			{55.4,79.6,75.6},	
			{94.6,12.3,121.5},	
			{456.8,157.5,126.5}
		};
		for (int i=0; i<d.length; i++)
		{
			for (int j=0; j<d[0].length; j++) {
			System.out.print(d[i][j]+"\t");
			
		} 
		System.out.println();
	}

}
}