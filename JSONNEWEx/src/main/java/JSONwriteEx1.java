import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.collections.Maps;

public class JSONwriteEx1 {

	@Test
	public void test() throws FileNotFoundException {
		
		JSONObject obj = new JSONObject();
		
		obj.put("myname", "Paritosh");
		obj.put("lastname", "Patil");
		obj.put("age", 26);
		
	    Map m = new LinkedHashMap(4);
	    
	    m.put("Address", "vishranwadi");
	    m.put("city", "Yavatmal");
	    m.put("State", "Maharashtra");
	    m.put("Pin code", "445102");
	    
	    obj.put("address", m);
	    
	    JSONArray jr = new JSONArray();
	    m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "123456"); 
          
        // adding map to list 
        jr.put(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "1234587"); 
          
        // adding map to list 
        jr.put(m); 
          
	    
	    obj.put("phoneno.", jr);
	    
	    PrintWriter pw = new PrintWriter("JSONEx.json"); 
        pw.write(obj.toString()); 
          
        pw.flush(); 
        pw.close(); 
	    
        
       
    }

	}
	
	
	

