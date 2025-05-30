/*12. Write a program to check if a year is leap year or not.
    if a year is divisible by 4 then it is a leap year but
	if the year is century year like 2000, 1900, 2100 then 
	it must be divible by 400.*/
	
	
class LeapYear
{
	public static void main(String... s)
	{
		System.out.println("Enter year");
		int year=new java.util.Scanner(System.in).nextInt();
		
		if(year%4==0 && year%400==0)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}