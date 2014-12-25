package csv.test.csvtester;

import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {

    private static final char DELIMITER = '\t';
    private static final String UTF8 = "UTF8";
    private static final String FILE_PATH = "person.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILE_PATH), UTF8));

        CSVReader csvReader = new CSVReader(bufferedReader, DELIMITER);
        String[] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            StringBuilder sb = new StringBuilder();
            for (String producedLine : nextLine) {
                sb.append(producedLine);
                sb.append(DELIMITER);
            }
            System.out.println(sb.toString());
        }
    }

}
