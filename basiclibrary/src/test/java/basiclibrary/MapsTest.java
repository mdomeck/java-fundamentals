package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MapsTest {

    Maps maps = new Maps();
    @Test public void testWeather() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String returnString = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69";
        System.out.println(returnString);
          assertEquals(returnString, maps.missingTemps(weeklyMonthTemperatures));
        }


        public static class TallyElectionTest {
            @Test
            public void testTallying() {
                Maps maps = new Maps();

                List<String> votes = new ArrayList<>();
                votes.add("Bush");
                votes.add("Bush");
                votes.add("Bush");
                votes.add("Shrub");
                votes.add("Hedge");
                votes.add("Shrub");
                votes.add("Bush");
                votes.add("Hedge");
                votes.add("Bush");

                String winner = "Bush received the most votes!";
                System.out.println(votes);
                System.out.println(winner);
                assertEquals(winner, maps.tally(votes));
            }
        }
}
