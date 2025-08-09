/*
       1
      232
     34543
    4567654
   567898765
  67890109876
 7890123210987
890123454321098

*/

public class PatternTest4
{
    public static void main(String[] args) 
	{
        int n = 8; // Number of rows

        for (int i = 1; i <= n; i++) 
		{
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) 
			{
                System.out.print(" ");
            }

            int num = i;
            
            // Print ascending numbers
            for (int j = 1; j <= i; j++) 
			{
                System.out.print( num % 10);
                num++;
            }

            num -= 2; // Adjust num to start descending

            // Print descending numbers
            for (int j = 1; j < i; j++) 
			{
                System.out.print( num % 10);
                num--;
            }

            System.out.println(); // Move to next line
        }
    }
}