import java.util.ArrayList;
import java.util.Scanner;

class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Show Name: " + getShowName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre();
    }

    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the TV show name (or press Enter to stop): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        System.out.println("TV Show List:");
        for (TvShow show : tvShows) {
            System.out.println(show);
        }

        scanner.close();
    }
}


