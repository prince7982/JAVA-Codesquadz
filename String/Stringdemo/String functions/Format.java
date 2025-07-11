/*
Creating Format Strings:
You have printf() and format() methods to print output with formatted numbers. The String class has an equivalent
class method ,format(), that returns a String object rather than a PrintStream object.

Using String's format() method allows you to create a formatted string that you can reuse, as opposed to a
one-time print statement.
*/

package p1;
class Format 
{
	public static void main(String... s)
	{
		float floatVar=2.4f;
		int intVar=10;
		String stringVar="HINDUSTAN";
		System.out.printf("The value of the float variable is = %f,while the value of the integer variable is = %d,and the string is = %s", floatVar,intVar,stringVar);

		String fs = String.format("The value of the float variable is = %f,while the value of the integer variable is = %d,and the string is = %s", floatVar,intVar,stringVar);	
        
        System.out.println(" ");		
        System.out.println(fs);		
		
	}
}