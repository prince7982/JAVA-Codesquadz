class CheckAlphabet
{
	public static void main(String s[])throws java.io.IOException
	{
		System.out.println("Enter the Character");
		int x=System.in.read();
		char ch=(char)x;
		if(ch=='M' || ch=='m')
			System.out.println("Male");
		else
			System.out.println("Female");
			System.out.println(x);
			System.out.println(ch);
	}
}