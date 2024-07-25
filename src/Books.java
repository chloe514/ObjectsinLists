import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the book title (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numberOfPages = scanner.nextInt();

            System.out.print("Enter the publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What information would you like to print? (everything/name): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            System.out.println("Book List:");
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            System.out.println("Book Titles:");
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}




