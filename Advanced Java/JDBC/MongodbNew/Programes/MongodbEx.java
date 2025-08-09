import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongodbEx 
{
    public static void main(String args[]) 
	{
        try 
		{
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            DB db = mongoClient.getDB("codesquadz");
            System.out.println("Connect to database successfully");

            boolean auth = db.authenticate("krish", "vani".toCharArray());
            System.out.println("Authentication: " + auth);
        } 
		catch (Exception e) 
		{
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
