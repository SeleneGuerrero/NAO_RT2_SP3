package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Class responsible for reading the configuration file.
 */
public class ConfigReader {
    private static final String CONFIG_FILE = "src/main/java/org/example/config.properties";

    /**
     * Gets the delimiter defined in the configuration file.
     *
     * @return CSV delimiter defined in the file. Defaults to ',' if there is an error.
     */
    public char getCsvDelimiter() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(CONFIG_FILE)) {
            properties.load(input);
            String delimiter = properties.getProperty("csv.delimiter", ";");
            // If the delimiter is \t (tab), replace it correctly
            if (delimiter.equals("\\t")) return '\t';
            return delimiter.charAt(0);
        } catch (IOException e) {
            System.err.println("Error reading configuration, using default delimiter ','");
            return ',';
        }
    }
}

