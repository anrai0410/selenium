package array;

public class TwoDarray_char2 {

	public static void main(String[] args) {
		char [][]  c= new char [3][5];
		c[0][0]= 'a';
		c[0][1]= 'b';
	    c[0][2]='c';
		c[0][3]='g';
		c[0][4]='r';
		c[1][0]='h';
	    c[1][1]='k';
		c[1][2]='u';
		c[1][3]='j';
		c[1][4]='e';
	    c[2][0]='t';
		c[2][1]='d';
		c[2][2]='k';
	    c[2][3]='m';
		c[2][4]='e';
		
		for (int i=0; i<c.length; i++)
		{ 
			for (int j=0; j<c[0].length; j++) 
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
