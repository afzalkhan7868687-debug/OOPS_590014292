import java.io.*;

public class update {
    public static void main(String[] args) {

        File originalFile = new File("sample.txt");
        File tempFile = new File("temp.txt");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                // update content here
                line = line.replace("old", "new");

                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // delete old file and rename temp file
        originalFile.delete();
        tempFile.renameTo(originalFile);

        System.out.println("File updated successfully without overwriting.");
    }
}
