/*
print this pattern

Enter The Number of Rows : 5

A
CB
EDC
GFED
IHGFE

*/

class Pattern31
{
	public static void main(String... s)
	{
		int i,j,rows;
		char ch='A';
		System.out.print("Enter The Number of Rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
		{
			char temp=ch;
			for(j=1;j<=i;j++)
			{
				System.out.print(temp);
				temp--;
			}
			System.out.print("\n");
			//ch=(char)(ch+2);
			ch+=2;
		}
	}
}