package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopyUsingByteStream {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");        // original file
        File destFile = new File("copy_byte.txt");       // copied file

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied using byte stream");

            // Check file sizes
            System.out.println("Source file size : " + sourceFile.length() + " bytes");
            System.out.println("Copied file size : " + destFile.length() + " bytes");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
