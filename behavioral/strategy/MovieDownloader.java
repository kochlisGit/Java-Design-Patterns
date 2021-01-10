package behavioral.strategy;

public class MovieDownloader implements Downloader
{
    @Override
    public void download(String[] urlArray) {
        for (String url : urlArray)
            System.out.println("Downloading movie with url: " + url);
    }
}
