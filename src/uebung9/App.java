package uebung9;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		GregorianCalendar gC = new GregorianCalendar(1988, 8, 22);
		SimpleDateFormat formatWeekDay = new SimpleDateFormat("EEEEEEE", Locale.GERMAN);
		SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMAN);
		
		System.out.println("Der " + formatDate.format(gC.getTime()) + " war ein " + formatWeekDay.format(gC.getTime()));
		gC.add(Calendar.DAY_OF_YEAR, 223);
		
		System.out.println("Der " + formatDate.format(gC.getTime()) + " war ein " + formatWeekDay.format(gC.getTime()));
		
		String writtenDate = "23. Juli 1988";
		SimpleDateFormat formatter = new SimpleDateFormat("dd. MMM yyyy", Locale.GERMAN);
		Date dateInstance = formatter.parse(writtenDate);
		
		LocalDate locDate = dateInstance.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int day = locDate.getDayOfMonth();
		int month = locDate.getMonthValue();
		int year = locDate.getYear();
	
		GregorianCalendar newGreg = new GregorianCalendar(year, month, day);
		System.out.println(newGreg.get(Calendar.MONTH));
				
	}
}