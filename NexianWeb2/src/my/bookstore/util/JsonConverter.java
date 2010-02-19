package my.bookstore.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class JsonConverter {
	
	
	public static String convertToJson(Object object){
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
		String jsonResult = xstream.toXML(object);
		return jsonResult;
	}

}
