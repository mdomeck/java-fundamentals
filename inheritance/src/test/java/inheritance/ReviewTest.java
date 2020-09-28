package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void testReview(){
        Review review1 = new Review("Best wings in town", "Minnie Mouse", 5);
        assertEquals("This has a review body", "Best wings in town", review1.getBody());
        assertEquals("This has a review author", "Minnie Mouse", review1.getAuthor());
        assertEquals("This has a review stars", 5, review1.stars);
    }

}
