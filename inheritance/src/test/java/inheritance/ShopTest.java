package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

//    @Test
//    public void toStringTest(){
//        assertTrue(String.format("Nordstrom Rack", "Apparel", "$$"), true);
//    }

    @Test
    public void testShop(){
        Shop nordstrom = new Shop("Nordstrom Rack", 5, "$$", "Apparel");
        assertEquals(nordstrom.getName(), "Nordstrom Rack");
        assertEquals(nordstrom.getStars(), 5);
        assertEquals(nordstrom.getPrice(), "$$");
        assertEquals(nordstrom.getDescription(), "Apparel");
    }

    @Test
    public void testShopReview(){
        Shop nordstrom = new Shop("Nordstrom Rack", 5, "$$", "Apparel");
        Review shopReview = new Review("Love the shoes!", "Meghan", 5);
        nordstrom.addReview(shopReview);
        System.out.println(nordstrom.feedback);
        assertEquals("[Author: Meghan  stars: 5 body: Love the shoes!]", nordstrom.feedback.toString());
    }
}
