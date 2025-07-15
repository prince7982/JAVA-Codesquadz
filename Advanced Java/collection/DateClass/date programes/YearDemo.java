import java.time.Year;

public class YearDemo 
{

    public static void main(String[] args) 
	{

        Year y1 = Year.of(2016);
        System.out.println(y1);
        Year y2 = y1.minusYears(1);
        System.out.println(y2);
        Year y3 = y1.plusYears(1);
        System.out.println(y3);
        Year y4 = Year.now();
        System.out.println(y4);
        if (y1.isLeap()) 
		{
            System.out.println(y1 + " is a leap year.");
        } else 
		{
            System.out.println(y1 + " is not a leap year.");
        }
    }
}
