package p1;
import java.util.*;
class SearchMax
{
	public static void main(String s[])
	{
		//int []a={10,20,30,40,3,4,5,80};
		
		int z[];
		
		int max=0;
		
		System.out.print("Enter the size of array = ");
		int x1=new Scanner(System.in).nextInt();
		z=new int[x1];
		for(int i=0;i<z.length;i++)
		{
			z[i]=new Scanner(System.in).nextInt();
		}
		
		System.out.print("[ ");
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]);
			System.out.print(" ");
			if(z[i]>max)
			{
				max=z[i];
			}
		}
		System.out.print("]");
		System.out.println("\n"+"maximum number is = "+max);
	}
}