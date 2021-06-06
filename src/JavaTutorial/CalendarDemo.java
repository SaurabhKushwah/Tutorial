package JavaTutorial;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYY hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf.format(cal.get(Calendar.DAY_OF_WEEK)));
		System.out.println(sdf.format(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)));
		System.out.println(sdf.format(cal.get(Calendar.MONDAY)));
		System.out.println(sdf.format(cal.get(Calendar.MINUTE)));
	}

}
