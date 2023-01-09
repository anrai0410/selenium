package inheritance;

public class Animal {
	
String Animal="eat";
}

class Dog extends Animal{
	 
	 String Dog="bark";



	public static void main(String[] args) {
		class babydog extends Dog
		{
		String babydog="weep";
		}
		
  
	 babydog bd= new babydog();
	 {
		 System.out.println(bd.Animal+" "+ bd.babydog);
		

	}
 }
	}
	

