/*5. Two Numbers are entered through the keyboard. Write a program to find the value of
     one number raised to the power of another.(Do not use java built-in method)*/
   
class Power
{
	public static void main(String... s)
	{
		System.out.println("Enter 1'st Value");
		int x=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter 2'st Value");
		int y=new java.util.Scanner(System.in).nextInt();
		
		int z=1;
		for(int i=1;i<=y;i++)
		{
			z=z*x;
		}
		System.out.println(x+" raised the power "+y+ " is = " +z);
	}
}