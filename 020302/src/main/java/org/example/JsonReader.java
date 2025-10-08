package org.example;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for reading JSON files using org.json.
 */
public class JsonReader {

    /**
     * Reads a JSON file and returns a list of People objects.
     *
     * @param filePath Path to the JSON file.
     * @return List of people obtained from the JSON file.
     * @throws IOException If an error occurs while reading the file.
     */
    public List<People> readJsonFile(String filePath) throws IOException {
        List<People> personas = new ArrayList<>();

        try {
            String content = Files.readString(Paths.get("src/main/java/org/example/person.json"));
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);

                People persona = new People(
                        obj.getString("name"),
                        obj.getInt("age"),
                        obj.getString("country"),
                        obj.getInt("id")
                );
                personas.add(persona);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

        return personas;
    }
}


