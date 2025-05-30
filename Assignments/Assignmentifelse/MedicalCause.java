/*9. Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical 
   cause or not ("Y" or "N") and print accordingly.*/
   
class MedicalCause
{
	public static void main(String... s)throws java.io.IOException
	{
		System.out.println("You have medical cause or not");
		int x=System.in.read();
		char medicalcause=(char)x;
		
		if(medicalcause=='Y' || medicalcause=='y')
			System.out.println("Allow student to sit in class");
		else if(medicalcause=='N' || medicalcause=='n')
			System.out.println("student not allowed to sit in class");
	}
}