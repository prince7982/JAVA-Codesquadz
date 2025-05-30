/*13. Ask user to enter age, sex (M or F), marital status (Y or N) and then using following rules print their place of service.

    if employee is female, then she will work only in urban areas.
	
	if employee is a male and age is in between 20 to 40 then he may work in anywhere
	
	if employee is male and age is in between 40 to 60 then he will work in urban areas only.
	
	And any other input of age should print "ERROR".*/
	
	
/*class PlaceOfService
{
	public static void main(String... s)
	{
		System.out.println("Enter Your Age");
		int age=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter Your Gender in M or F");
		String gender=new java.util.Scanner(System.in).nextLine();
		
		System.out.println("Enter Your Maritial Status in Y or N");
		String maritial=new java.util.Scanner(System.in).nextLine();
		
		if(gender == ('Female') && gender == ('female'))
			System.out.println("Work only in urban areas");
		else if((gender == ('M') && gender == ('m')) &&(age>=20 && age<=40))
			System.out.println("Work anywhere");
		else if((gender == ('M') && gender == ('m')) &&(age>=40 && age<=60))
			System.out.println("Work in urban areas only");
		else if((age>=1 && age<20)&&(age>60))
			System.out.println("ERROR");

	}
}*/

class PlaceOfService
{
	public static void main(String s[])throws java.io.IOException
	{
		System.out.println("Enter Your Age");
		int age=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter Your Gender in M or F");
		int x=System.in.read();
		char gender=(char)x;
		
		System.out.println("Enter Your Maritial Status in Y or N");
		int y=System.in.read();
		char marital=(char)y;
		
		if(gender=='F' || gender=='f')
			System.out.println("Work only in urban areas");
		else
			System.out.println("Work only in cities areas");
	}
}