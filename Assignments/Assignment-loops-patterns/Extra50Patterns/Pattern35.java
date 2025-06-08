/*
Print this Pattern

    A
   B C
  C D E
 D E F G
E F G H I

*/

class Pattern35
{
	public static void main(String... s)
	{
		int i,j,space,rows=5;
		char ch;
		for(i=0;i<rows;i++)
		{
			for(space=1;space<rows-i;space++)
			{
				System.out.print(" ");
			}
			
			ch=(char)('A'+i);
			for(j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.print("\n");
		}
	}
}