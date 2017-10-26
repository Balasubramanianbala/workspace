package in.vamsoft.training.trainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(125);
    list.add(425);
    list.add(225);
    list.add(325);
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    Collections.sort(list);
    int pos = Collections.binarySearch(list, 325);
    System.out.println(pos);
  }

}
