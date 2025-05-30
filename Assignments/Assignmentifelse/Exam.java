/*8. A student will not be allowed to sit in exam if his/her attendance is less than 75%.
     take following input from user
     Number of classes held
     Number of classes attended. 
     And print
     percentange of class attended.
     is student is allowed to sit in exam or not.*/


class Exam
{
	public static void main(String... s)
	{
		System.out.println("Enter the number of classes Held");
		int ClassHeld=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Enter the number of classes attended");
		int Attend=new java.util.Scanner(System.in).nextInt();
		
		float per=((float)Attend/ClassHeld)*100;
		//int per=(int)(((double)Attend/ClassHeld)*100);
		System.out.println("Percentage is = "+per+"%");
	}
}