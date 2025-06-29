import java.util.HashMap;
import java.util.Map;

public class HashMapClone
{
	public static void main(String a[])
	{
		HashMap hasMap = new HashMap();
		
		hasMap.put(1,"One");
		hasMap.put(2,"Two");
		hasMap.put(3,"Three");
		System.out.println("Original HashMap : " + hasMap);
		
		HashMap hasMap1 = (HashMap) hasMap.clone();
		
		System.out.println("Copied HashMap : " + hasMap1);
	}
}