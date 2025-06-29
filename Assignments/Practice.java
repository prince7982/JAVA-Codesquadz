//swapping of two variables without using third variable

/*
class Practice
{
	public static void main(String... s)
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
*/





//swapping of two variables using third variable
/*
class Practice
{
	public static void main(String... s)
	{
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
*/






//Factorial of a given number
/*
class Practice
{
	public static void main(String... s)
	{
		int n=new java.util.Scanner(System.in).nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" = "+fact);
	}
}
*/



//Fibonacci series
/*
class Practice
{
	public static void main(String... s)
	{
		int n=new java.util.Scanner(System.in).nextInt();
		int a=0,b=1;
		System.out.print("Fibonacci Series : ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=n;i++)
		{
			int temp=a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
		}
	}
}
*/




//Prime Number
/*
class Practice
{
	public static void main(String... s)
	{
		System.out.print("Enter the Number = ");
		int n=new java.util.Scanner(System.in).nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			int z=n%i;
			if(z==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a prime number");
		}
		else
			System.out.println(n+" is not a prime number");
	}
}
*/




//First 50 Prime Number
/*
class Practice
{
	public static void main(String... s)
	{
		System.out.println("First 50 Prime Number");
		int count=0;
		int count1=0;
		int start=2;
		while(true)
		{
			for(int i=1;i<=start;i++)
			{
				int z=start%i;
				if(z==0)
				{
					count1++;
				}
			}
			if(count1==2)
			{
				System.out.print(start+" ");
				count++;
			}
			if(count==50)
			{
				break;
			}
			start++;
			count1=0;
		}
	}	
}
*/





//reverse a string
/*
class Practice
{
	public static void main(String... s)
	{
		String str;
		String reversed="";
		System.out.print("Enter the Original String = ");
		str=new java.util.Scanner(System.in).nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Reversed String = "+reversed);
	}	
}
*/





//reverse a number
/*
class Practice
{
	public static void main(String... s)
	{
		int z;
		int reversed=0;
		System.out.print("Enter the Number = ");
		int n=new java.util.Scanner(System.in).nextInt();
		while(n>0)
		{
			z=n%10;
			n=n/10;
			reversed=reversed*10+z;
		}
		System.out.print("Reversed Number = "+reversed);
	}	
}
*/




//Pallindrome program
class Practice
{
	public static void main(String... s)
	{
		int z;
		int reversed=0;
		System.out.print("Enter the Number = ");
		int n=new java.util.Scanner(System.in).nextInt();
		int original=n;
		while(n>0)
		{
			z=n%10;
			n=n/10;
			reversed=reversed*10+z;
		}
		if(original==reversed)
		{
			System.out.print("Number is Pallindrome");
		}
		else
		{
			System.out.print("Not a Pallindrome");
		}
	}	
}