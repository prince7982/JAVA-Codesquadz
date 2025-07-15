import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormatter
{
	public static void main(String a[])
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		
		System.out.println("yyyy.MM.dd 'at' HH:mm:ss z ---> "+sdf.format(new Date()));
		sdf = new SimpleDateFormat("hh 'o''clock' a, zzzz");
		System.out.println("hh 'o''clock' a, zzzz ---> "+sdf.format(new Date()));
	}
}