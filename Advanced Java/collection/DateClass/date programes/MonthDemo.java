import java.time.LocalDate;
import java.time.Month;

public class MonthDemo 
{
    public static void main(String[] args) 
	{
        LocalDate localDate = LocalDate.of(2016, Month.SEPTEMBER, 12);
        System.out.println(localDate);

        Month month1 = Month.from(localDate);
        System.out.println(month1);

        Month month2 = Month.of(2);
        System.out.println(month2);

        Month month3 = month2.plus(2);
        System.out.println(month3);

        Month month4 = localDate.getMonth();
        System.out.println(month4);

        int monthIntValue = month2.getValue();
        System.out.println(monthIntValue);
    }
}
