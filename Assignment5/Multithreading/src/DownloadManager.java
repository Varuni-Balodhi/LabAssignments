public class DownloadManager {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            String url = "https://www.dropbox.com/photo" + i + ".jpg";

            FileDownloader downloader = new FileDownloader(url);
            Thread thread = new Thread(downloader, "Thread-" + i);
            thread.start();
        }
    }
}
