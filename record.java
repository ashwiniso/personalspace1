import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class record {
    // creating a check method
    public boolean checkwrong() {
        File file = new File("filepath/Srecords.txt");

        try {
            Scanner scanner = new Scanner(file);
            // now reading the file line by line
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if (line.contains("Farguson")) {
                    // breaks the loop and returns true indicating that there is an error
                    // replacing the wrong string with the new line
                    line.replaceAll("Farguson", "\n");

                } else {
                    return false;
                }
                return true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
