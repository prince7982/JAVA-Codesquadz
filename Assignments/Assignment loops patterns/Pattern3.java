/*
print this pattern 

*****
 ****
  ***
   **
    *
	
*/



class Pattern3
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter the number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}