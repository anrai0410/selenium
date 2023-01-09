package inheritance;

public class Inheritance_java {
	int salary=15000;


	

 
	public static void main(String[] args) {
		
		
		
		class programmer extends Inheritance_java
		{ 
			
			int bonus=5000;
		}
	 
	programmer p= new programmer();
	
        System.out.println(p.bonus);
       System.out.println(p.salary + p. bonus);  
	}

}
