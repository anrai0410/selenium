package class_andconstructor;


public class Myclass {
	int a;
	double d;
	String str;
	char c; // data member
	void display() // member function
	{
	System.out.println("a="+a);
	System.out.println("d="+d);
	System.out.println("c="+c);
	System.out.println("str="+str);
	}
	public static void main(String[] args) {
		int x;
		x=10;
		System.out.println(x);
		
		
		
 Myclass ob= new  Myclass();
 ob.a=35;
 ob.d=568.4; 
 ob.c='d';
 ob.str="java";
 ob.display();
	}

}
