/*String bno - to store the bile's number(UP65AB1234)
String name - to store the name of the customer
int days - to store the number of days the bike is taken on rent
int charge - to calculate and store the rental charge

to compute the rental charge the rent for a mobike is charged on the following basis
First five days Rs 500 per day;
Next five days Rs 400 per day
Rest of the days Rs 200 per day
void Display() - to display the details in the following format:
Bike No. Name No. of days Charge*/

class Mobike1
{
	public static void main(String... s)
	{
		int charge=0;
		System.out.println("Enter the Bike Number");
		String bno=new java.util.Scanner(System.in).nextLine();
		
		System.out.println("Enter the Customer Name");
		String name=new java.util.Scanner(System.in).nextLine();
		
		System.out.println("Enter the no of Days");
		int days=new java.util.Scanner(System.in).nextInt();
		
		if(days<=5)
		{
			charge=500*days;
		}
		else if(days>5 && days<=10)
		{
			charge=2500+400*(days-5);
		}
		else if(days>10)
		{
			charge=2500+2000+200*(days-10);
		}
		
		System.out.println(" ");
		System.out.print("Bike No"+"\t\t"+"Customer Name"+"\t"+"Days"+"\t"+"Charge");
		System.out.println(" ");
		System.out.print(bno+"\t");
		System.out.print(name+"\t\t");
		System.out.print(days+"\t");
		System.out.print(charge+"\t");
		System.out.println(" ");
	}
}