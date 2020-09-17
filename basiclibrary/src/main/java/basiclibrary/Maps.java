package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Maps {

    public String missingTemps(int[][] array) {
        HashSet<Integer> temps = new HashSet<>();
        int high = array[0][0];
        int low = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temps.add(array[i][j]);
                if (array[i][j] > high) {
                    high = array[i][j];
                } else if (array[i][j] < low) {
                    low = array[i][j];
                }
            }
        }
        System.out.println(temps);

        String returnsString = "High: " + high + "\nLow: " + low;

        for (int k = low; k < high; k++) {
            if (!temps.contains(k)) {
                returnsString = returnsString + "\nNever saw temperature: " + k;
            }
        }

        return returnsString;


    }

    // Help from Jack on contains Key

    public String tally(List<String> plants) {
        int count = 0;
        HashMap<String, Integer> votes = new HashMap<>();

        for (String name : plants) {
            if (votes.containsKey(name)) {
                count = votes.get(name);
            } else {
                count = 0;
            }
            votes.put(name, count + 1);
        }
        System.out.println(votes.get("Bush"));

        System.out.println(votes.keySet());

        String returnString = "Bush received the most votes!";

        return "hi";
    }
}




