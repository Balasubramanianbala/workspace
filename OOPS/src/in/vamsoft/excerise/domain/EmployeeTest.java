package in.vamsoft.excerise.domain;

public class EmployeeTest {

  public static void printEmployee(Employee e) {
    /*System.out.println(e.getEmpid());
    System.out.println(e.getName());
    System.out.println(e.getSsn());
    System.out.println(e.getSalary());*/
    System.out.println(e);

  }

  public static void main(String[] args) {

    Engineer engineer = new Engineer(101, "Jane Smith", "012-34- 5678", 120345.27);
    Manager manager = new Manager(207, "Barbara Johnson", "054-12- 2367", 109501.36, "US Marketing");
    Admin admin = new Admin(304, "Bill Monroe", "108-23- 6509", 75002.34);
    Director director = new Director(12, "Susan Wheeler", "099-45- 2340", 120_567.36, "Global Marketing", 1_000_000.00);
    
    printEmployee(manager);
    manager.setName("Arulraja");
    printEmployee(director);
    printEmployee(manager);
    printEmployee(engineer);
    printEmployee(admin);
    
    Manager mnn = new Manager();
    mnn.addEmployee(13, "jbkj", "hgfdcjhg", 54564);
    mnn.addEmployee(13, "jbkj", "hgfdcjhg", 54564);
    mnn.addEmployee(15, "jbkj", "hgfdcjhg", 54564);
    
    mnn.printManagerDetails();
    
    
  }

}
