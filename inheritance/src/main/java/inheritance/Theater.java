package inheritance;

import java.util.ArrayList;

public class Theater extends Restaurant implements IReviewable{
     public ArrayList<String> movieListings = new ArrayList<>();

    public Theater(String name, int stars, String price) {
        super(name, stars, price);

    }


    public void addMovie(String movieTitle) {
        this.movieListings.add(movieTitle);
    }

    public void removeMovie(String movieTitle){
        this.movieListings.remove(movieTitle);
    }

    public String toString() {
       // return String.format("Theater: %s, Stars: %d, Price: %s, MovieTitle: %s", getName(), getStars(), getPrice(), movieListings.toString());
    return String.format("Theater: ", this.name);
    }
}
