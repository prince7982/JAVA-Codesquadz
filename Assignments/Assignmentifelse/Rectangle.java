//1. Take values of length and Breadth of a rectangle from user and check if it is square or not.


class Rectangle
{
	public static void main(String... s)
	{
		System.out.println("Enter the Length of a Rectangle");
		int length=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter the Breadth of a Rectangle");
		int breadth=new java.util.Scanner(System.in).nextInt();
		
		if(length==breadth)
			System.out.println("Rectangle is Square");
		else
			System.out.println("Not a Square");
			
	}
}