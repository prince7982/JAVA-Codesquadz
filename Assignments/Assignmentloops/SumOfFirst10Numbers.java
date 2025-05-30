//2. write a program to calculate the sum of first 10 natural number.

class SumOfFirst10Numbers
{
	public static void main(String... s)
	{
		int sum=0;
		int i=1;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of first 10 Natural Number is ="+" "+sum);
	}
}