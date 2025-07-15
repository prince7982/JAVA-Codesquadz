import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateDemo1
{
    public static void main(String[] args) 
	{
        //MonthDay dec25 = MonthDay.of(Month.DECEMBER, 25);
        MonthDay dec25 = MonthDay.of(Month.AUGUST, 14);
        //MonthDay dec25 = MonthDay.of(Month.APRIL, 24);
        Year year = Year.now();

        for (int i = 0; i <= 5; i++) 
		{
            LocalDate ld = year.plusYears(i).atMonthDay(dec25);
            int yr = ld.getYear();
            String weekDay = ld.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.format("Bday in %d is on %s.%n", yr, weekDay);
        }
    }
}
