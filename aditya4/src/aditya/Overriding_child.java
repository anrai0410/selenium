package aditya;

public class Overriding_child extends overriding
{ 
	@Override
	void child_numbers (int a, int b) {

		System.out.println("show numbers "+ (a-b));
	}
		public static void Main (String[] args) {
			Overriding_child ch= new Overriding_child();
			ch.child_numbers (15,5);
		}
}
