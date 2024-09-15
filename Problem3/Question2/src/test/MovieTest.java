package test;

import movie.Movie;
import movie.MovieItem;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();
        MovieItem item1 = new MovieItem("Inception", "Christopher Nolan");
        MovieItem item2 = new MovieItem("The Matrix", "The Wachowskis");
        MovieItem item3 = new MovieItem("Interstellar", "Christopher Nolan");
        movie.addMovieItem(item1);
        movie.addMovieItem(item2);
        movie.addMovieItem(item3);
        movie.printMovieDetails();
    }
}
