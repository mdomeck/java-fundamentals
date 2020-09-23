package inheritance;


import java.util.ArrayList;

public class Restaurant implements IReviewable {
    public ArrayList<Review> feedback = new ArrayList<>();
    public String name;
    public int stars;
    public String price;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public void addReview(Review opinion) {
        this.feedback.add(opinion);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public int getStars() {

        return stars;
    }

    public void setStars(int stars) {

        this.stars = stars;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String toString() {
        return String.format("Restaurant: %s, Stars: %d, Price: %s", name, stars, price);
    }


}
