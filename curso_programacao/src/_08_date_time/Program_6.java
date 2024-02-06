package _08_date_time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 05:18:53");
		
		Date d = Date.from(Instant.parse("2018-08-27T21:08:04Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, 5);
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutes: " + minutes);
	}

}
