/*
print this pattern

     *
    *-*
   *---*
  *-----*
 *-------*

*/

class Pattern15
{
	public static void main(String... s)
	{
		int i,j,space,rows;
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<=rows-1;i++)
		{
			for(space=2;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");  //print first star

            if(i>=1)
            {
				for(j=1;j<=2*i-1;j++)
				{
					System.out.print("-"); //print - inside the triangle
				}
				System.out.print("*");
			}	
            System.out.print("\n");			
		}
	}
}