package inheritance;

public class Review extends Restaurant {

    private String body;
    private String author;

    public Review(String name, int stars, String price, String body, String author) {
        super(name, stars, price);
        this.body = body;
        this.author = author;
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
        return String.format("Name: %s, Price: %s Author: %s  stars: %d body: %s", getName(), getPrice(), this.author, this.getStars(), this.body);

    }
}
