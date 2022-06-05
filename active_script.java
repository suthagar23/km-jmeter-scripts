
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

String connectionString = "<...>";

MongoClientURI clientURI = new MongoClientURI(connectionString);
MongoClient mongoClient = new MongoClient(clientURI);

MongoDatabase testDB = mongoClient.getDatabase("sample-database");
MongoCollection<Document> numbersCollection = testDB.getCollection("samplecollection");

Document doc = new Document("name", "test").append("value", "ok");
numbersCollection.insertOne(doc);
