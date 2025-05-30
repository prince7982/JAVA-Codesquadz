/*4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
     Ask user for their salary and year of service and print the net bonus amount.*/


class Company
{
	public static void main(String... s)
	{
		System.out.println("Enter Your Salary");
		int salary=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("How Many Years you work on our company");
		int year=new java.util.Scanner(System.in).nextInt();
		
		float bonus=salary/5;
		
		if(year>=5){
			System.out.println("Your Bonus is = "+bonus);
		}
		else{
			System.out.println("No Bonus");
		}
	}
}