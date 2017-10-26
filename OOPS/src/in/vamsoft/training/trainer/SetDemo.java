package in.vamsoft.training.trainer;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class SalComparator implements Comparator<Employeedemo> {

  @Override
  public int compare(Employeedemo ed, Employeedemo ed1) {

    if (ed.sal < ed1.sal) {
      return -1;
    } else if (ed.sal > ed1.sal) {
      return 1;
    } else  {
      return 0;
    }

  }

}

public class SetDemo {

  public static void main(String[] args) {

    Set<Employeedemo> treeset = new TreeSet<>(new SalComparator());
    Set<Employeedemo> treeset1 = new TreeSet<>();
    Employeedemo e = new Employeedemo(1, "siva", 20000);
    Employeedemo e1 = new Employeedemo(4, "guna", 25000);
    Employeedemo e2 = new Employeedemo(2, "Vimal", 30000);
    Employeedemo e3 = new Employeedemo(3, "Mariappan", 22000);
    treeset1.add(e);
    treeset1.add(e1);
    treeset1.add(e2);
    treeset1.add(e3);
    treeset.add(e);
    treeset.add(e1);
    treeset.add(e2);
    treeset.add(e3);
    System.out.println(treeset);
    System.out.println(treeset1);
    
  }

}
