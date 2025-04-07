package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class SeriesTracker {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> SeriesTracker = new HashMap<>();
        ArrayList<String> romanceSeries = new ArrayList<>();
        romanceSeries.add("You");
        romanceSeries.add("How I met your mother");
        romanceSeries.add("Game of Thrones");

        ArrayList<String> crimeSeries = new ArrayList<>();

        crimeSeries.add("Law and Order");
        crimeSeries.add("Dexter");
        crimeSeries.add("Sherlock Holmes");
        crimeSeries.add("Slow Horses");
        crimeSeries.add("Castle");

        ArrayList<String> comedySeries = new ArrayList<>();
        comedySeries.add("Scrubs");
        comedySeries.add("B99");
        comedySeries.add("2 broke girls");
        comedySeries.add("Big Bang Theory");

        SeriesTracker.put("Romance", romanceSeries);
        SeriesTracker.put("Crime", crimeSeries);
        SeriesTracker.put("Comedy", comedySeries);

        for (String key : SeriesTracker.keySet()) {
            ArrayList<String> value = SeriesTracker.get(key);
            if (key.equalsIgnoreCase("comedy")){
                System.out.println(value);
            }
        }

    }
}