package inheritance;

public class App {

    public  String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Roosters", 5, "$$");
        System.out.println(restaurant);

        Review minnie = new Review("Best wings ever!","Minnie Mouse", 5);
        minnie.restaurantImAbout = restaurant;
        System.out.println(minnie);

        restaurant.addReview(minnie);
        System.out.println(restaurant.feedback);

        Shop shop = new Shop("Nordstrom Rack",5, "$$", "Apparel");
        System.out.println(shop);

//        Review nordstrom = new Review("I love shopping here!" 5, )
//        shop.addReview();

        Theater theater = new Theater("AMC", 5, "$$");
        System.out.println(theater);
    }



}
