import java.time.LocalDate;
import java.time.Month;

public class WithMethod
{
	public static void main(String[] args)
	{
		LocalDate localDate1 = LocalDate.of(2018, Month.SEPTEMBER,29);
		System.out.println(localDate1);
		
		LocalDate localDate2 = localDate1.withYear(2019);
		System.out.println(localDate2);
		
		LocalDate localDate3 = localDate1.withYear(2014).withMonth(7);
		System.out.println(localDate3);
	}
}