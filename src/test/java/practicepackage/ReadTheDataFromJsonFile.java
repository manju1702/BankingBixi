package practicepackage;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadTheDataFromJsonFile 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		FileReader filepath = new FileReader(".\\src\\test\\resources\\jsonread.json");
		//json parser is used to read/write json formated file
		JSONParser jsonp = new JSONParser();
		Object obj = jsonp.parse(filepath);
		//read data from json file
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
	}

}
