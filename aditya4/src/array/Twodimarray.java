package array;

public class Twodimarray {

	public static void main(String[] args) {
		int [][] a=new int [4][3];
		a[0][0]=11;
		a[0][1]=21;
		a[0][2]=17;
		a[1][0]=61;
		a[1][1]=10;
		a[1][2]=71;
		a[2][0]=51;
		a[2][1]=31;
		a[2][2]=41;
		a[3][0]=19;
		a[3][1]=17;
		a[3][2]=15;
		
		int row =a.length;
		int col= a[0].length;
		System.out.println("ROW "+ row);
		System.out.println("col "+ col);
		 for (int i=0; i<4; i++)
		 {
			 for (int j=0; j<3; j++)
			 {
				 System.out.print(a[i][j] + "\t");
			 
			 }
			 System.out.println();
		 }
			 
	}
	

}
