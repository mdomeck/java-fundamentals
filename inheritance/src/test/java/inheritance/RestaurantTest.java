package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RestaurantTest {

    @Test
    public void testRestaurant(){
        Restaurant roosters = new Restaurant("Roosters", 5, "$$");
        assertEquals(roosters.getName(), "Roosters");
        assertEquals(roosters.getStars(), 5);
        assertEquals(roosters.getPrice(), "$$");
    }

    @Test public void toStringTest(){
        assertTrue(String.format("Roosters", "$$", "Minnie Mouse", 4, "Best wings ever!"), true);
    }


    @Test
    public void testShopReview(){
        Restaurant roosters = new Restaurant("Roosters", 5, "$$");
        Review restaurantReview = new Review("Best Wings ever!", "Meghan", 5);
        roosters.addReview(restaurantReview);
        System.out.println(roosters.feedback);
        assertEquals("[Author: Meghan  stars: 5 body: Best Wings ever!]", roosters.feedback.toString());
    }


}
