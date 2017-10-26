package in.vamsoft.training.trainer;

public class Employee implements Comparable<Employee> {

  int empcode;
  String empName;
  double sal;

  public String getEmpName() {
    return empName;
  }

  public Employee(int empcode, String empName) {

    this(empcode, empName, 20000);
  }

  public Employee(int empcode, String empName, double sal) {
    super();
    this.empcode = empcode;
    this.empName = empName;
    this.sal = sal;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public double getSal() {
    return sal;
  }

  private void setSal(double sal) {
    this.sal = sal;
  }

  public int getEmpcode() {
    return empcode;
  }

  public void incrementsal(double salary) {

    if (salary >= this.sal * 10 / 100) {
      this.sal = this.sal + salary;
    } else {

      System.out.println("your not elligible for incremented salary");
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empcode;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee other = (Employee) obj;
    if (empcode != other.empcode) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Employee o) {
    if (this.empcode > o.empcode) {
      return -1;
    } else if (this.empcode < o.empcode) {
      return 1;
    } else {
      return 0;
    }

    //return 0;
  }

  @Override
  public String toString() {
    return "Employee [empcode=" + empcode + ", empName=" + empName + ", sal=" + sal + "]";
  }

}
