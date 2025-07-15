import java.util.Date;

public class CurrentDateTime
{
	public static void main(String[] argv)
	{
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
	}
}