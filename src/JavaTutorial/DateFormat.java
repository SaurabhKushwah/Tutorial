package JavaTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		System.out.println(d.toString());
		
		// Format the Date into the desired format
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	}

}
