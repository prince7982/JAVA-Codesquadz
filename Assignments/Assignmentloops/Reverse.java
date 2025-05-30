/*6. Write a program that prompts the user to input an integer and then outputs
   the number with the digits reversed. example, if the input is 12345,then output should be 54321.*/

class Reverse
{
	public static void main(String... s)
	{
		int rev=0;
		int z;
		while(true)
		{
			System.out.println("Enter the value1");
			int x1=new java.util.Scanner(System.in).nextInt();
			while(x1>0)
			{
				z=x1%10;
				x1=x1/10;
				rev=rev*10+z;
			}
			System.out.println(rev);
			rev=0;
			System.out.println("Do you want to continue press 1 for yes 0 for no");
			int x2=new java.util.Scanner(System.in).nextInt();
			if(x2==1)
				continue;
			else
				break;
			
		}
	}
}