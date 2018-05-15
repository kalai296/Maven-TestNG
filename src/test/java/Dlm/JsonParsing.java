package Dlm;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.json.Json;

import com.jayway.jsonpath.JsonPath;

public class JsonParsing {

	
	public static void main(String args[]) throws IOException {
		
		File jsonFile = new File("C://Users//20446583//DLMProject//src//main//java//resources//objectRepository.json");
		HashMap<String, String> protocolFeature = new HashMap<String, String>();
		protocolFeature = JsonPath.read(jsonFile, "$."+"protocol.feature");
		System.out.println(protocolFeature);
	}
}
