package date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringto_date {

	public static void main(String[] args) throws ParseException  {
	 String datestr = "15/06/2022";
	//conver string into date
	SimpleDateFormat sd0= new SimpleDateFormat("dd/MM/yyyy");
	Date  date=sd0.parse(datestr);
	System.out.println(date);
	
	
	}

}
