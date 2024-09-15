package movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<MovieItem> movieItems;

    public Movie() {
        movieItems = new ArrayList<>();
    }

    public void addMovieItem(MovieItem item) {
        movieItems.add(item);
    }

    public void printMovieDetails() {
        for (MovieItem item : movieItems) {
            item.printDetails();
        }
    }
}
