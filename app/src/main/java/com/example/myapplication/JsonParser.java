package com.example.myapplication;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;

public class JsonParser {
    public static String getJSONFromFile(String filename) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ( (line = bufferedReader.readLine()) != null){
                jsonText += line + "\n";
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonText;
    }
    public static void main(String[] argd) throws ParseException {
        String strJson = getJSONFromFile("C:\\Users\\HP\\Downloads\\recipes (7).json");
        JSONParser parser = new JSONParser();
        Object object = parser.parse(strJson);
        JSONObject mainJsonObject = (JSONObject) object;
    }

}
