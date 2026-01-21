import java.util.Random;
public class FileDownloader implements Runnable {
    private String fileUrl;
    public FileDownloader(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    @Override
    public void run() {
        String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
        System.out.println(
                Thread.currentThread().getName()
                + " - Starting download: " + fileName
        );
        try {
            // Random sleep between 200–500 ms
            Random random = new Random();
            Thread.sleep(200 + random.nextInt(301));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                Thread.currentThread().getName()
                + " - Completed: " + fileName
        );
    }
}
