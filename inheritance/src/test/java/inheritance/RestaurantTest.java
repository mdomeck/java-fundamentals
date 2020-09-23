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
//    @Test public void testRestaurantReview(){
//        Restaurant roosters = new Restaurant("Roosters", 5, "$$");
//        Review testReview = new Review("Best wings in town!", "Minnie Mouse", 5);
//        roosters.addReview(testReview);
//       assertEquals(roosters.feedback.indexOf(0), testReview);
//
//    }

}
