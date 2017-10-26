package in.vamsoft.training.trainer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.crypto.Mac;

public class Dictionaryset {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();

    map.put("nike", "A bat company");
    map.put("britania", "buiscut company");
    map.put("redundant", "extra or unnecessary");
    map.put("deligently", "paying deep attention towards details");
    map.put("concrete", "defenite");

    System.out.println(map);
    int k = 5;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < k; i++) {
      System.out.println("Please enter a word");
      String word = sc.nextLine();
      if (map.containsKey(word)) {
        System.out.println(map.get(word));
      } else {
        System.out.println("Invalid word");
      }
    }
  }
}
