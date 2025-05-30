/*8. Write a program that prompts the user to input a positive integer. it should then output a message indicating
   whether the number is a prime number.*/
   
class PrimeOrNot
{
	public static void main(String... s)
	{
		System.out.println("Enter the number");
		int x=new java.util.Scanner(System.in).nextInt();
		int count=0;
		for(int i=1;i<=x;i++)
		{
			int z=x%i;
			if(z==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is a prime Number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}