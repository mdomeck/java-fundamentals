package inheritance;

public class App {

    public  String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Roosters", 5, "$$");
        System.out.println(restaurant);

        Review minnie = new Review("Roosters", 4, "$$", "Best wings ever!", "Minnie Mouse");
        System.out.println(minnie);

        restaurant.addToFeedback(minnie);
        System.out.println(restaurant.feedback);


    }



}
