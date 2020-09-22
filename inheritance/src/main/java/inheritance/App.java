package inheritance;

public class App {

    public  String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Roosters", 5, "$$");
        System.out.println(restaurant.getName() + " " + restaurant.getStars() + " " + restaurant.getStars());
        System.out.println(restaurant);
    }

}
