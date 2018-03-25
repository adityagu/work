package cybage;

import java.util.Calendar;
import java.util.Date;

public class DateProg {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("current date is  " + d);
		
		Calendar cal = Calendar.getInstance();
		
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, lastDate);
		System.out.println("last date of this month  " + cal.getTime());
		
		
	}

}
