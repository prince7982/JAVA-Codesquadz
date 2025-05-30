/*
print this pattern

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

class Pattern10
{
	public static void main(String... s)
	{
		int i,j,space,rows,k=0;
		System.out.print("Enter the number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=rows;i>=1;i--)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			
			for(j=1+k;j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
			k++;
		}
		
		k=1;
		for(i=1;i<rows;i++)
		{
			for(space=1;space<rows-i;space++)
			{
				System.out.print(" ");
			}
			
			for(j=rows-k;j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
			k++;
		}
	}
}