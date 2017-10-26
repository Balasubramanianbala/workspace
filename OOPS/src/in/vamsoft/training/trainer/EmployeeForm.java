package in.vamsoft.training.trainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class EmployeeForm {

  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();
    Map<Integer, List<Employee>> map = new HashMap<>();
    int empcode;
    int empkey;
    String name;
    double sal;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    while (true) {
      System.out.println("1.add\n2.delete\n3.view");
      int choice = sc.nextInt();
      switch (choice) {

      case 1: {
        System.out.println("empolyee key");
        empkey = sc.nextInt();
        System.out.println("enter the empcode,name,sal");
        empcode = sc.nextInt();
        name = sc1.nextLine();
        sal = sc.nextDouble();

      
        Employee emp = new Employee(empcode, name, sal);
        list.add(emp);
        map.put(empkey, list);
        break;
      }
      
      case 2:
        System.out.println("enter the delete employee");
        int ec;
        ec = sc.nextInt();
        if (map.containsKey(ec)) {
          map.remove(ec);
        } else {
          System.out.println("not foundkey");
        }
        break;
      case 3:
        Set<Entry<Integer, List<Employee>>> ent = map.entrySet();
        for (Entry<Integer, List<Employee>> e : ent) {
          System.out.println("empkey\tempcode\tempname\tsalarry\n");
          System.out.println(e.getKey() + "\t" + e.getValue() + "\n");

        }
        break;
      default:
        System.out.println("your choice not found");
      }

    }
  }

}
