//2. Take two int values from user and print greatest among them.

class GreatestNo
{
	public static void main(String... s)
	{
		System.out.println("Enter the 1'st Number");
		int first=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter the 2'nd Number");
		int second=new java.util.Scanner(System.in).nextInt();
		
		if(first>second)
			System.out.println("first is greatest that is = "+first);
		else
			System.out.println("second is greatest that is = "+second);
	}
}