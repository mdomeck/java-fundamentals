package inheritance;

import java.util.ArrayList;

public class Shop extends Restaurant{

    private String description;

    public Shop(String name, int stars, String price, String description) {
        super(name, stars, price);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String toString(){
        return String.format("Shop: %s, Description: %s, Price: %s", getName(), description, getPrice());
    }
}
