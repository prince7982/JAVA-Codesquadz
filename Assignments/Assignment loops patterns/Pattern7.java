/*
print this pattern

     *
    * *
   *   *
  *     *
 *       *
***********

*/

class Pattern7
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter Number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");    //print first star
			
			if(i>=1)
			{
				for(j=1;j<=2*i-1;j++)
				{
					System.out.print(" ");   //print spaces inside the triangle
				}
				System.out.print("*");  //print last star if it's not the first row
			}
			System.out.print("\n");
		}
		
		for(i=1;i<=2*rows+1;i++)
		{
			System.out.print("*");
		}
	}
}