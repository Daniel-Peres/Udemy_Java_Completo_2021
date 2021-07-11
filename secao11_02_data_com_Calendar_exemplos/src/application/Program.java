package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int hour = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		int dayOfYear = cal.get(Calendar.DAY_OF_MONTH);
		int month = 1 + cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		System.out.println("Day of Year: " + dayOfYear);
		System.out.println("Mouth: " + month);
		System.out.println("Year: " + year);
		System.out.println("Hour: " + hour);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}
}