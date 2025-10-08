package org.example;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class responsible for writing data to a CSV file using OpenCSV.
 */
public class CsvWriter {

    private final char delimiter;

    public CsvWriter(char delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Write a list of people to a CSV file.
     *
     * @param filePath Path of the output CSV file.
     * @param personas List of People objects.
     */
    public void writeCsvFile(String filePath, List<People> personas) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath),
                delimiter,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)) {

            // Head
            String[] header = {"ID", "Name", "Age", "Country"};
            writer.writeNext(header);

            // Rows
            for (People p : personas) {
                String[] row = {
                        String.valueOf(p.getId()),
                        p.getName(),
                        String.valueOf(p.getAge()),
                        p.getCountry()
                };
                writer.writeNext(row);
            }

            System.out.println("CSV file created in: " + filePath + " with delimiter '" + delimiter + "'");

        } catch (IOException e) {
            System.err.println("Error writing CSV file:" + e.getMessage());
        }
    }
}
