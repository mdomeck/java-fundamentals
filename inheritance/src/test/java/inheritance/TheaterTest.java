package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TheaterTest {


    @Test
    public void testAddTheater(){
        Theater amc = new Theater("AMC", 5, "$$");
        amc.addMovie("Mary Poppins");
        assertEquals(amc.getName(), "AMC");
        assertEquals(amc.getStars(), 5);
        assertEquals(amc.getPrice(), "$$");
        assertEquals(amc.movieListings.toString(), "[Mary Poppins]");
    }

    @Test
    public void testRemoveTheater(){
        Theater amc = new Theater("AMC", 5, "$$");
        amc.addMovie("Mary Poppins");
        assertEquals(amc.getName(), "AMC");
        assertEquals(amc.getStars(), 5);
        assertEquals(amc.getPrice(), "$$");
        assertEquals(amc.movieListings.toString(), "[Mary Poppins]");
        amc.removeMovie("Mary Poppins");
        assertEquals(amc.movieListings.toString(), "[]");
    }

    @Test
    public void testShopReview(){
        Theater amc = new Theater("AMC", 5, "$$");
        Review theaterReview = new Review("Love the popcorn!", "Meghan", 5);
        amc.addReview(theaterReview);
        System.out.println(amc.feedback);
        assertEquals("[Author: Meghan  stars: 5 body: Love the popcorn!]", amc.feedback.toString());
    }



}
