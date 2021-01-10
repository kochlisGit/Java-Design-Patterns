package behavioral.strategy;

// Strategy pattern is used to execute a different method / algorithm each time.
public class StrategyDemo
{
    public static void main(String[] Args)
    {
        DatabaseDownloader.download( new MovieDownloader(), new String[] {"Movie1", "Movie2"} );
        DatabaseDownloader.download( new ReviewDownloader(), new String[] {"Review1", "Review2"} );
    }
}
