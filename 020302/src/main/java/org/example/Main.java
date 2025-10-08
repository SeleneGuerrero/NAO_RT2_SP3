package org.example;

import java.io.IOException;
import java.util.List;

/**
 * Main class for testing JSON reading and CSV writing.
 */
public class Main {
    public static void main(String[] args) {
        JsonReader reader = new JsonReader();
        ConfigReader config = new ConfigReader();
        char delimiter = config.getCsvDelimiter();
        CsvWriter writer = new CsvWriter(delimiter);

        try {
            // 1. Read JSON
            List<People> personas = reader.readJsonFile("src/main/java/org/example/person.json");

            // 2. Write CSV with delimiter configured
            writer.writeCsvFile("src/main/java/org/example/output.csv", personas);

        } catch (IOException e) {
            System.err.println("Error en el proceso: " + e.getMessage());
        }
    }
}
