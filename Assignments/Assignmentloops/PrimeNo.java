/*8. Write a program that prompts the user to input a positive integer. It should then
   output a message indicating whether the number is a prime number.*/

class PrimeNo
{
	public static void main(String... s)
	{
		System.out.println("Enter the value1");
		int x1=new java.util.Scanner(System.in).nextInt();
		//String name=new java.util.Scanner(System.in).nextLine();
		int count=0;
		for(int i=1;i<=x1;i++)
		{
			int z=x1%i;
			if(z==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(x1+" is a prime Number");
		else
			System.out.println(x1+" is not a prime Number");
	}
}