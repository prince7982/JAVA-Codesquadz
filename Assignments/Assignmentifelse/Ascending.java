//14. Take three values from the user amd print them in ascending order

class Ascending
{
	public static void main(String... s)
	{
		System.out.println("Enter 3 values");
		int x=new java.util.Scanner(System.in).nextInt();
		
		int y=new java.util.Scanner(System.in).nextInt();
		
		int z=new java.util.Scanner(System.in).nextInt();
		
		int temp=0;
		if(x>y)
		{
			temp=x;
			x=y;
			y=temp;   //swap x and y if(x>y)
		}
	    if(x>z)
		{
			temp=x;
			x=z;
			z=temp;   //swap x and z if (x>z)
		}
	    if(y>z)
		{
			temp=y;
			y=z;
			z=temp;   //swap y and z if (y>z)
		}
	
	    System.out.println("Number in Ascending order : \n" +x+"\n"+y+"\n"+z);
		
	}
}