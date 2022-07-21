package com.S01T07N02.S01T07N02MartiComasAdria;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class App {
	
    private static FileWriter file;
    
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
        JSONObject obj = new JSONObject();
        obj.put("Assignatura", "Matematiques");
        obj.put("Alumnes", "25");
 
        JSONArray alumnesMates = new JSONArray();
        alumnesMates.add("nom: Adria");
        alumnesMates.add("nom: Paula");
        alumnesMates.add("nom: Maria");
        obj.put("Llista alumnes", alumnesMates);
     
        try {
        	 
            file = new FileWriter("/Users/Shared/matematiques.json");
            file.write(obj.toJSONString());

 
        } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 



   
	
}
