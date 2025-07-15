import java.time.ZoneId;
import java.util.*;

public class Zone
{
	public static void main(String[] args)
	{
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		TreeSet<String> ts = new TreeSet<>(zoneIds);
		for(String zoneId: ts)
		{
			System.out.println(zoneId);
		}
	}
}