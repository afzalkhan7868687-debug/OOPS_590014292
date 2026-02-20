import java.io.*;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {

        try {
            // input files
            File f1 = new File("file1.txt");
            File f2 = new File("file2.txt");

            // output merged file
            FileWriter fw = new FileWriter("merged.txt");

            // read first file
            Scanner sc1 = new Scanner(f1);
            while (sc1.hasNextLine()) {
                fw.write(sc1.nextLine() + "\n");
            }
            sc1.close();

            // read second file
            Scanner sc2 = new Scanner(f2);
            while (sc2.hasNextLine()) {
                fw.write(sc2.nextLine() + "\n");
            }
            sc2.close();

            fw.close();

            System.out.println("Files merged successfully into merged.txt");

        } 
        catch (IOException e) {
            System.out.println("Error while merging files");
        }
    }
}
