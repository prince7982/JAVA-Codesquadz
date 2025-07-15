import java.time.LocalDate;

public class PlusMethod
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.of(2016, 9, 12);
		LocalDate localDate1 = localDate.plusDays(5);
		System.out.println(localDate1);
		LocalDate localDate2 = localDate.plusMonths(3);
		System.out.println(localDate2);
		LocalDate localDate3 = localDate.plusWeeks(3);
		System.out.println(localDate3);
		
	}
}