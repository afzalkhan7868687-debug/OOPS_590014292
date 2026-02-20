import java.io.*;
import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {

        try {

            File file = new File("file1.txt");

            // read file
            Scanner sc = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append("\n");
            }
            sc.close();

            // replace word
            String newData = sb.toString().replace("old", "new");

            // overwrite file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(newData);
            bw.close();

            System.out.println("Content replaced successfully!");

        }
        catch (IOException e) {     
            System.out.println("File error occurred");
        }
    }
}
