package in.vamsoft.training.trainer;

public class Employeeexm {

  public static void main(String[] args) {

    Employee e1 = new Employee(10, "kamal", 15000);
    System.out.println("before salary" + e1.sal);
    e1.incrementsal(5000);
    System.out.println("after sal" + e1.sal);

  }

}
