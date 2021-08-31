package hashTable;

public class TestMyHashMap {
    public static void main(String[] args) {
        // Create a map
        MyMap<String, Integer> map = new MyHashMap<>();
        map.put("Jonadab", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        map.put("Smith", 65);

        System.out.println("Entries in map: " + map);

        System.out.println("The age for Jonadab is " +
                map.get("Jonadab"));

        System.out.println("Is Anderson in the map? " +
                map.containsKey("Anderson"));
        System.out.println("Is age 64 in the map? " +
                map.containsValue(64));

        map.remove("Jonadab");
        System.out.println("Entries in map: " + map);

        map.clear();
        System.out.println("Entries in map: " + map);
    }
}
