package array;

public class Twodarray_char_1 {

	public static void main(String[] args) {
		char [] [] c= { {'a','b','d'},	
			{'e','g','d'},	
			{'a','i','y'},	
			{'l','r','i'}
		};
		for (int i=0; i<c.length; i++)
		{
			for (int j=0; j<c[0].length; j++) {
			System.out.print(c[i][j]+"\t");
			
		} 
		System.out.println();
	}

}
}