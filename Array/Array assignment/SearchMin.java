package p1;
import java.util.*;
class SearchMin
{
	public static void main(String s[])
	{
		int z[];
		int min,x1,i;
		
		System.out.print("Enter the size of array = ");
		x1=new Scanner(System.in).nextInt();
		
		z=new int[x1];
		
		for(i=0;i<z.length;i++)
		{
			z[i]=new Scanner(System.in).nextInt();
		}
		
		min=z[0];
		System.out.print("[ ");
		System.out.print(min + " ");
		for(i=1;i<z.length;i++)
		{
			System.out.print(z[i]);
			System.out.print(" ");
			if(z[i]<min)
			{
				min=z[i];
			}
		}
		System.out.print("]");
		System.out.println("\n"+"Minimum Number is  = "+min);
	}
}