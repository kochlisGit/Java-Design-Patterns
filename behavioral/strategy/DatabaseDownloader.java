package behavioral.strategy;

public class DatabaseDownloader
{
    public static void download(Downloader downloader, String[] urlArray) {
        downloader.download(urlArray);
    }
}
