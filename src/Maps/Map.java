package Maps;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(386868, "Graz");
        map.put(2005500, "Vienna");
        map.put(212538, "Linz");
        map.put(19007100, "New York");
        map.put(8866180, "London");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            if (key < 1000000) {
                System.out.println(value + " " + key);
            }
            if (key > 1000000) {
                System.out.println(value + " " + key);
            }
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        map.remove(8866180, "London");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
map.replace(386868, "Graz", "London");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
