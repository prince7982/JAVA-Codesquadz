import java.util.Scanner;
class NumberOfDigits
{
	public static void main(String... s)
	{
		int no=0,a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		no = scanner.nextInt();
		if(no<0)
		{
			no=no*-1;
		}
		else if(no==0)
		{
			no=1;
		}
		while(no>0)
		{
			no=no/10;
			a++;
		}
		System.out.println("Number of digits in given number is :"+a);
	}
}