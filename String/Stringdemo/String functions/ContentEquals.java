package p1;
public class ContentEquals
{
	public static void main(String args[])
	{
		String str1 = "Not immutable";
		String str2 = "Strings are immutable";
		StringBuffer str3 = new StringBuffer("Not immutable");
		
		boolean result = str1.contentEquals(str3);
		System.out.println(result);   //true
		
		result = str2.contentEquals(str3);
		System.out.println(result);   //false
	}
}