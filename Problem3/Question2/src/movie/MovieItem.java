package movie;

public class MovieItem {
    private String title;
    private String author;

    public MovieItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
