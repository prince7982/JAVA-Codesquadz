/*
print this pattern

    *
   ***
  *****
 *******
 *******
  *****
   ***
    * 


*/


class Pattern1{
	public static void main(String... s)
	{
		int i,space,rows,k=0;
		System.out.print("Enter the number of rows : ");
		rows=new java.util.Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;++i)
		{
			for(space=1;space<=rows-i;++space)
			{
				System.out.print(" ");
			}
			while(k!=2*i-1)
			{
				System.out.print("*");
				++k;
			}
			k=0;
			System.out.print("\n");
		}
		
		
		
		for(i=rows;i>=1;--i)
		{
			for(space=1;space<=rows-i;++space)
			{
				System.out.print(" ");
			}
			
			k=0;
			while(k!=2*i-1)
			{
				System.out.print("*");
				++k;
			}
			System.out.print("\n");
		}
	}
}