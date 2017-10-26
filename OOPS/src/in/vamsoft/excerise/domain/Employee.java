package in.vamsoft.excerise.domain;

public class Employee {

  @Override
  public String toString() {
    return "Employee [empid=" + empid + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
  }

  private int empid;
  private String name;
  private String ssn;
  private Double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.isEmpty() || name.trim().equals("")) {
      this.name = "Name should not be empty or null..!";
    }else {
      this.name = name;
    }
  }

  public int getEmpid() {
    return empid;
  }

  public String getSsn() {
    return ssn;
  }

  public Double getSalary() {
    return salary;
  }

  public Employee(int empid, String name, String ssn, Double salary) {
    super();
    this.empid = empid;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }

  public Employee() {
   
  }

  public void raiseSalary(double sal) {

    if (sal > 0) {

      if (sal >= this.salary * 10 / 100) {
        this.salary = this.salary + sal;
      } else {

        System.out.println("your not elligible for incremented salary");
      }
    } else {
      System.out.println("salary should be non negative");
    }
  }
  
  public void printEmployee() {
    System.out.println("Employee id:"+getEmpid());
    System.out.println("Employee name:"+getName());
    System.out.println("Employee ssn:"+getSsn());
    System.out.println("Employee salary:"+getSalary());
  }
}
