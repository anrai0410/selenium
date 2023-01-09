package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_demo {

	public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	{
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
	String dateStr = sd.format(date);
	System.out.println(dateStr   );
	}
	{SimpleDateFormat sd0 = new SimpleDateFormat ("dd-MMMM-yyyy");
	String datestr0=sd0.format(date);
	System.out.println(datestr0);
	}
	{SimpleDateFormat sd1 = new SimpleDateFormat ("dd|MMMM yy hh:mm");
	String datestr1=sd1.format(date);
	System.out.println(datestr1);
	}
	{
		SimpleDateFormat sd0 = new SimpleDateFormat ("dd-MMMM-yyyy");
		String datestr0=sd0.format(date);
		System.out.println(datestr0);
	}
	{
		SimpleDateFormat sd3 = new SimpleDateFormat ("EEEE yyyy|MM|dd");
		String datestr3=sd3.format(date);
		System.out.println(datestr3);
	}
	{
		SimpleDateFormat sd4 = new SimpleDateFormat ("dd-MM-yyyy|E|hh:mm");
		String datestr4=sd4.format(date);
		System.out.println(datestr4);
	}
	{
		SimpleDateFormat sd5 = new SimpleDateFormat ("hh:mm:ss");
		String datestr5=sd5.format(date);
		System.out.println(datestr5);
	}
	}

}
