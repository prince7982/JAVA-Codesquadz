import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekDemo 
{
    public static void main(String[] args) 
	{
        LocalDate localDate = LocalDate.of(1976, 2, 15);
        System.out.println(localDate);

        DayOfWeek dayOfWeek1 = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek1);

        int intValue = dayOfWeek1.getValue();
        System.out.println(intValue);

        DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
        System.out.println(dayOfWeek2);

        DayOfWeek dayOfWeekFromInteger = DayOfWeek.of(7);
        System.out.println(dayOfWeekFromInteger);

        DayOfWeek dayOfWeekAdded = dayOfWeekFromInteger.plus(1);
        System.out.println(dayOfWeekAdded);

        DayOfWeek dayOfWeekSubtracted = dayOfWeekFromInteger.minus(2);
        System.out.println(dayOfWeekSubtracted);
    }
}
