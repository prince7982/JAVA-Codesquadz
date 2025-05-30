/*10. Write a do-while loop that asks the user to enter two numbers should be added and the sum displayed.
    The loop should ask the user whether he or she wishes to perform the operation again.
	if so, the loop should repeat; otherwise it should terminate.*/
	
	
class SumOftwoNumbers
{
	public static void main(String... s)
	{
		int sum=0;
		while(true)
		{
			System.out.println("Enter 1'st Number");
			int num1=new java.util.Scanner(System.in).nextInt();
			
			System.out.println("Enter 1'st Number");
			int num2=new java.util.Scanner(System.in).nextInt();
			
			sum=num1+num2;
			System.out.println("Sum of "+num1+" and "+num2+" is = "+sum);
			sum=0;
			System.out.println("Do you want to continue press 1 for yes 0 for no");
			int x2=new java.util.Scanner(System.in).nextInt();
			if(x2==1)
				continue;
			else
				break;
		}
		
		
	}
}