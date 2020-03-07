import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class UpdateJSON {
	@Test
	public void update() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("JSONEx.json"));

		JSONObject jo = (JSONObject) obj;
		String myname = (String) jo.get("myname");
		String newName="Paritosh";
		if (myname.equals("Nikhit"))
		{

			jo.put("myname",newName);
		}
		PrintWriter pw = new PrintWriter("JSONEx.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();

	}

}