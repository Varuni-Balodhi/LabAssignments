package FileHandling;
import java.io.*;
public class BufferedVsUnbufferedCopy {
    public static void main(String[] args) {
        File source = new File("source.png");   // any file (image/pdf/text)
        File noBufferCopy = new File("copy_nobuffer.png");
        File bufferCopy = new File("copy_buffer.png");
        long timeWithoutBuffer = 0;
        long timeWithBuffer = 0;
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(noBufferCopy)
        ) {
            long start = System.currentTimeMillis();
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            long end = System.currentTimeMillis();
            timeWithoutBuffer = end - start;
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found!");
            return;
        } catch (IOException e) {
            System.out.println("I/O error during non-buffered copy.");
            return;
        }
        try (
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(bufferCopy))
        ) {
            long start = System.currentTimeMillis();

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            long end = System.currentTimeMillis();
            timeWithBuffer = end - start;

        } catch (IOException e) {
            System.out.println("I/O error during buffered copy.");
            return;
        }
        System.out.println("Without Buffering: " + timeWithoutBuffer + " ms");
        System.out.println("With Buffering   : " + timeWithBuffer + " ms");
        System.out.println("Performance improved by: "+ (timeWithoutBuffer - timeWithBuffer) + " ms");
        System.out.println("File Size Check:");
        System.out.println("Source file size      : " + source.length() + " bytes");
        System.out.println("No-buffer copy size   : " + noBufferCopy.length() + " bytes");
        System.out.println("Buffered copy size    : " + bufferCopy.length() + " bytes");
    }
}
