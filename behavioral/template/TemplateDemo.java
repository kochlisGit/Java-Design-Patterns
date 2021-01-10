package behavioral.template;

// Template pattern is used, because it is the simplest way to extend a class and override its methods.
public class TemplateDemo
{
    public static void main(String[] Args)
    {
        Downloader downloader = new MovieDownloader();
        downloader.download( new String[] {"Movie1", "Movie2"} );

        downloader = new ReviewDownloader();
        downloader.download( new String[] {"Movie1", "Movie2"} );
    }
}
