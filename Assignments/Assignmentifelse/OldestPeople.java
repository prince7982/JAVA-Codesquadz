/*6. Take input of age of 3 people by user and determine oldest and youngest among them.*/


class OldestPeople
{
	public static void main(String... s)
	{
		System.out.println("Enter 1 person age");
		int first=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter 2 person age");
		int second=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter 3 person age");
		int third=new java.util.Scanner(System.in).nextInt();
		
		
		if(first>second && first>third)
			System.out.println("First person is older");
		else if(second>first && second>third)
			System.out.println("Second person is older");
		else
			System.out.println("Third person is older");
	}
}