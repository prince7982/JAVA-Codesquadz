import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class UpdateRecord 
{
    public static void main(String args[]) throws Exception 
	{
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        DB db = mongoClient.getDB("codesquadz");
        boolean auth = db.authenticate("krish", "vani".toCharArray());
        System.out.println("Authentication: " + auth);

        DBCollection coll = db.getCollection("users");
        System.out.println("Collection users selected successfully");

        DBCursor cursor = coll.find();
        while (cursor.hasNext()) 
		{
            DBObject updateDocument = cursor.next();
            updateDocument.put("name", "CodeSquadzH65");
            coll.save(updateDocument);
        }

        System.out.println("Document updated successfully");

        cursor = coll.find();
        int i = 1;
        while (cursor.hasNext()) 
		{
            System.out.println("Updated Document: " + i);
            System.out.println(cursor.next());
            i++;
        }
    }
}
