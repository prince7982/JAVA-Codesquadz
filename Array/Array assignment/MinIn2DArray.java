package p1;
import java.util.Scanner;

public class MinIn2DArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		// Taking rows and columns input
		System.out.print("Enter number of rows : ");
		int rows=sc.nextInt();
		
		System.out.print("Enter number of columns : ");
		int cols=sc.nextInt();
		
		// Declare and initialize the 2D array
		int arr[][]=new int [rows][cols];
		
		// Taking input for the 2D array
		System.out.println("Enter "+(rows * cols)+" elements :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		// Find the minimum element
		int min=arr[0][0];   // Assume first element is min		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		
		// Print the minimum element
		System.out.println("Minimum number in the 2D Array = " + min);
	}
}