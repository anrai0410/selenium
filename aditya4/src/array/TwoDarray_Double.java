package array;

public class TwoDarray_Double {

	public static void main(String[] args) {
		double [][]  d= new double [4][3];
		d[0][0]= 11.2;
		d[0][1]= 14.2;
	    d[0][2]=87.2;
		d[1][0]=55.4;
		d[1][1]=79.6;
		d[1][2]=75.6;
	    d[2][0]=94.6;
		d[2][1]=12.3;
		d[2][2]=121.5;
		d[3][0]=456.8;
	    d[3][1]=157.5;
		d[3][2]=126.5;
		
		for (int i=0; i<d.length; i++)
		{ 
			for (int j=0; j<d[0].length; j++) 
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
