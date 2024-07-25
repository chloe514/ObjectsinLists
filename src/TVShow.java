public class TVShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor
    public TVShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter for show name
    public String getShowName() {
        return showName;
    }

    // Getter for number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // toString method to print TV show details
    @Override
    public String toString() {
        return "Show Name: " + showName + ", Number of Episodes: " + numberOfEpisodes + ", Genre: " + genre;
    }
}

