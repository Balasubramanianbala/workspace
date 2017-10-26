package in.vamsoft.training.trainer;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class mobComparator implements Comparator<Customer> {

  
  @Override
  public int compare(Customer cd, Customer cd1) {
    if (cd.mobno < cd1.mobno) {
      return -1;
    } else if (cd.mobno > cd1.mobno) {
      return 1;
    } else  {
      return 0;
    }
  }

}

class Namecom implements Comparator<Customer>{

  @Override
  public int compare(Customer c1, Customer c2) {
    
    return c1.getCname().compareToIgnoreCase(c2.getCname());
  }
  
}
public class CustomerDemo {

  public static void main(String[] args) {

    Set<Customer> treeset = new TreeSet<>(new mobComparator());
    Set<Customer> treeset1 = new TreeSet<>();
    Set<Customer> treeset2 = new TreeSet<>(new Namecom());
    Customer c = new Customer(1, "Siva", 9582637, "rahul st");
    Customer c1 = new Customer(4, "guna", 856256, "abdul st");
    Customer c2 = new Customer(2, "vimal", 6985895, "kumar st");
    Customer c3 = new Customer(3, "Mariappan", 9522000, "pillaiyar st");
    treeset.add(c);
    treeset.add(c1);
    treeset.add(c2);
    treeset.add(c3);
    treeset1.add(c);
    treeset1.add(c1);
    treeset1.add(c2);
    treeset1.add(c3);
    treeset2.add(c);
    treeset2.add(c1);
    treeset2.add(c2);
    treeset2.add(c3);
    System.out.println(treeset1);
    System.out.println(treeset);
    System.out.println(treeset2);
  }
}
