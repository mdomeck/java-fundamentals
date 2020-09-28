package inheritance;

import java.util.ArrayList;

public class Review {
    //public ArrayList<Review> feedback;

   // public Restaurant restaurantImAbout;

    private String body;
    private String author;
    public int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        //this.feedback = new ArrayList<Review>();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return String.format("Author: %s  stars: %d body: %s", this.author, this.stars, this.body);
    }
}
