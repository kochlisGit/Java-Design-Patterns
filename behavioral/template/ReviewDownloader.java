package behavioral.template;

public class ReviewDownloader implements Downloader
{
    @Override
    public void download(String[] urlArray) {
        for (String url : urlArray)
            System.out.println("Downloading review with url: " + url);
    }
}
