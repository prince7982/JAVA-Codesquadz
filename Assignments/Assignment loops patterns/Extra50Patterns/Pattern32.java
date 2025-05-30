/*
print this pattern

Enter the Number of Rows : 5

    *
   1 2
  * * *
 1 2 3 4
* * * * *

*/

class Pattern32
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
	}
}