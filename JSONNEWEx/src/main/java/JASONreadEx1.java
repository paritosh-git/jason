import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JASONreadEx1 {

	@Test
	public void Read01() throws FileNotFoundException, IOException, ParseException {
		  Object obj = new JSONParser().parse(new FileReader("JSONEx.json")); 
          
	        
	        JSONObject jo = (JSONObject) obj; 
	          
	        
	        String myname = (String) jo.get("myname"); 
	        String lastname = (String) jo.get("lastname"); 
	          
	        System.out.println(myname); 
	        System.out.println(lastname); 
	          
	        
	        long age = (Long) jo.get("age"); 
	        System.out.println(age); 
	          
	      
	        Map address = ((Map)jo.get("address")); 
	          
	      
	        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
	        while (itr1.hasNext()) { 
	            Map.Entry pair = itr1.next(); 
	            System.out.println(pair.getKey() + " : " + pair.getValue()); 
	            
	        }
	        
	        JSONArray jr = (JSONArray) jo.get("phoneno."); 
	          
	    
	        Iterator itr2 =  jr.iterator(); 
	          
	        while (itr2.hasNext())  
	        { 
	            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
	            while (itr1.hasNext()) { 
	                Map.Entry pair2 = itr1.next(); 
	                System.out.println(pair2.getKey() + " : " + pair2.getValue()); 
	            } 
	            
	            
	           
	        } 
	    } }
