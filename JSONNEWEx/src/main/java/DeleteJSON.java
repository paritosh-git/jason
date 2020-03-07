import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class DeleteJSON {
	@Test
	public void update() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("JSONEx.json"));
		  JSONObject jo = (JSONObject) obj; 
		 Set keys = jo.keySet();
	        Iterator iterator = keys.iterator();
	        while (iterator.hasNext()) {
	            String key = (String) iterator.next();          
	            if (key.equals("phoneno.")) {
	                System.out.println("REMOVING KEY:VALUE");
	                System.out.println(key + ":" + jo.get(key).toString());
	                iterator.remove();
	                jo.remove(key);
	            }
		}
		PrintWriter pw = new PrintWriter("JSONEx.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();

	}

}