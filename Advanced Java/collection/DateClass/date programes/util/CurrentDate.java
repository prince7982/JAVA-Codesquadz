import java.util.*;

public class CurrentDate
{
    public static void main(String args[])
    {
        Date today = new Date();
        //Date today = new Date("05/12/2014 18:30:45");
        //Date today = new Date(5,12,2014,18,30,45);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(today);
        System.out.println("Today: " + today.toString());
        displayDateInfo(cal);
        cal.clear();
    }

    static void displayDateInfo(GregorianCalendar cal)
	{
        String days[] = {"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        String months[] = {"January","February","March","April","May",
                           "June","July","August","September","October",
                           "November","December"};
        String am_pm[] = {"AM","PM"};
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + months[cal.get(Calendar.MONTH)]);
        System.out.println("Date: " + cal.get(Calendar.DATE));
		System.out.println("Day: " + days[cal.get(Calendar.DAY_OF_WEEK)]);

        System.out.println("Hour: " + (cal.get(Calendar.HOUR)));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));
        System.out.println(am_pm[cal.get(Calendar.AM_PM)]);
        TimeZone tz = cal.getTimeZone();
        System.out.println("Time Zone: " + tz.getID());
	}
}
