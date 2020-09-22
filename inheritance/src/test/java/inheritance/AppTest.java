package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasGreeting(){
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testRestaurant(){
        Restaurant Roosters = new Restaurant("Roosters", 5, "$$");
    }

    @Test public void testReview(){
        Review review1 = new Review("Roosters",4, "$$", "best wings in town", "Minnie Mouse");
    }
    @Test public void toStringTest(){
        assertTrue(String.format("Roosters", "$$", "Minnie Mouse", 4, "Best wings ever!"), true);
    }





}
