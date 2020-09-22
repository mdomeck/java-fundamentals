package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private String price;

    public Restaurant(String name, int stars, String price){
        this.name = name;
        this.stars = stars;
        this.price = price;
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
    public String toString(){
        return String.format("Restaurant : %s, Stars: %d, Price: %s", name, stars, price);
    }
}
