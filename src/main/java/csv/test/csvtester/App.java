package csv.test.csvtester;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:\\Temp\\person_cut.txt");
        CSVReader reader = new CSVReader(fr,'\t');
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            //System.out.println(nextLine[0] + nextLine[1] + "etc...");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nextLine.length; i++){
                sb.append(nextLine[i]);
                sb.append("^");
            }
            System.out.println(sb.toString());
        }

        System.out.println("Hello World!");
    }
}
