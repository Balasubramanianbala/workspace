package in.vamsoft.training.trainer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();

    System.out.println(map.put(1, "kaviya"));
    System.out.println(map.put(2, "oviya"));
    System.out.println(map.put(4, "maviya"));
    System.out.println(map.put(1, "kavitha"));
    System.out.println(map.put(3, "arulraja"));
    System.out.println(map);
    System.out.println(map.get(3));
    if (!map.containsKey(5)) {
      map.put(5, "siva");
    }
    System.out.println(map);
    Set<Integer> keys = map.keySet();
    System.out.println(keys);
    Collection<String> val = map.values();
    System.out.println(val);
    Set<Entry<Integer, String>> ent = map.entrySet();
    for (Entry<Integer, String> e : ent) {
      System.out.println(e.getKey() + "" + e.getValue()
      );
    }

  }

}
