package tutorial1;
import java.util.HashMap;
public class JavaHashmap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<Integer, String> city = new HashMap<>();

        city.put(1, "Yangon");
        city.put(2, "Mandalay");
        city.put(3, "Bago");
        System.out.println("HashMap: " + city);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + city.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + city.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + city.entrySet());
    }

}
