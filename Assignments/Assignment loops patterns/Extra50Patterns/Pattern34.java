/*
Print this Pattern

Enter the Number of Rows : 5

    1
   0 1
  0 1 0
 0 1 0 1
0 1 0 1 0

*/

class Pattern34
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
				if(j%2==0 || i==1)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.print("\n");
		}
	}
}