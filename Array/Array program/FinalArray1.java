import java.util.*;
class FinalArray1
{
	public static void main(String s[])
	{
		final int z[]={10,20,30};
		System.out.println(z[0]);
		z[0]=20000;
		System.out.println(z[0]);
		int y[]={100,202,300};
		System.out.println(y.length);
		//z=y;
		System.out.println(z[0]);
	}
}