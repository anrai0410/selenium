package aditya;

class UnderageException  extends Exception
{
UnderageException ()
{
	super("you are under age");
}
UnderageException(String message)
{
	super(message);
}
}
class voting
{
	public static void main(String[] args)
{
		int age=17;
		 try
		 {
			if (age<18)
			{
		
			throw new UnderageException();
		}
		 }
		 catch (UnderageException e)
		 {
		  e.printStackTrace();
		 }
}
}
