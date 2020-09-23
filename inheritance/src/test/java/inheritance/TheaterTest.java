package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TheaterTest {

    @Test
    public void toStringTest(){
        assertTrue(String.format("AMC", 5, "$$"), true);

    }

    @Test
    public void testTheater(){
        Theater amc = new Theater("AMC", 5, "$$");
        amc.addMovie("Mary Poppins");
        assertEquals(amc.getName(), "AMC");
        assertEquals(amc.getStars(), 5);
        assertEquals(amc.getPrice(), "$$");
        assertEquals(amc.movieListings.toString(), "[Mary Poppins]");
    }

//    @Test public void testTheaterReview(){
//        Theater amc = new Theater("AMC", 5, "$$");
//        Review testReview = new Review("I love the popcorn!", "Minnie Mouse", 5);
//        amc.addReview(testReview);
////        assertEquals(amc.feedback.indexOf(0), testReview);
//
//    }

}
