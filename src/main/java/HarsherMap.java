import java.util.HashMap;

public class HarsherMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("Lagos", 500);
        map.put("Port Harcourt", 540);
        map.put("Ogun", 392);
        map.put("Osun", 310);
        map.put("Abuja", 780);
        map.put("Enugu", 500);
        System.out.println(map);
        ///Accessing the value of the corresponding  key
        Integer lagosValue = map.get("Lagos");
        System.out.println(lagosValue);
        // to get the size after removing a key and value
        map.remove("Osun");
        int size = map.size();
        System.out.println(map);
        System.out.println(size);
        // hashmap boolean statament
        boolean exist = map.containsKey("Port Harcourt");
        System.out.println(exist);
//        int object = map.get();
    }
}
