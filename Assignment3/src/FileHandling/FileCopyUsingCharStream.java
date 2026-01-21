package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUsingCharStream {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");   // source file
        File destFile = new File("Copy_Char.txt");  // destination file

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destFile)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            // flush is implicit here, but safe to call explicitly
            writer.flush();

            System.out.println("File copied using character streams.");
            System.out.println("Source file size : " + sourceFile.length());
            System.out.println("Copied file size : " + destFile.length());

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
