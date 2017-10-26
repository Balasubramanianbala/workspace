package in.vamsoft.training.trainer;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    int x = 10;
    Integer i = x;
    List list = new ArrayList<>();
    list.add(14);
    list.add("ramu");
    System.out.println(list);
    List<Integer> mark = new ArrayList<Integer>();
    mark.add(60);
    mark.add(58);
    mark.add(70);
    mark.add(90);
    System.out.println(mark);
    mark.add(2,40);
    System.out.println(mark);
    mark.set(2,80);
    System.out.println(mark);
    
  }
}
