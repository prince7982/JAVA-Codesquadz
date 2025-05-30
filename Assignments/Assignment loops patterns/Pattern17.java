/*
print this pattern

   *      *
  ***    ***
 *****  *****
**************

*/
class Pattern17
{
	public static void main(String... s)
	{
		int i,j,space,rows,k=0;
		System.out.print("Enter the Numbers of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			
			while(k!=2*i-1)
			{
				System.out.print("*");
				k++;
			}
			k=0;
			
			for(space=1;space<=2*(rows-i);space++)
			{
				System.out.print(" ");
			}
			
			while(k!=2*i-1)
			{
				System.out.print("*");
				k++;
			}
			k=0;
			System.out.print("\n");
		}
	}
}