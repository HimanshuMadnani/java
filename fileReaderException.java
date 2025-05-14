import java.io.*;

public class fileReaderException {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            File file = new File("sample.txt");
            reader = new BufferedReader(new FileReader(file));

            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());

        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Failed to close file reader.");
            }
        }
    }
}
