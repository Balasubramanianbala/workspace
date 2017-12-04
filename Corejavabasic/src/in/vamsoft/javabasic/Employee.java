package in.vamsoft.javabasic;

public class Employee {
  
  int eno;
  String ename;
  Double salary;
  public Employee() {
    super();
    
  }
  public Employee(int eno, String ename, Double salary) {
    super();
    this.eno = eno;
    this.ename = ename;
    this.salary = salary;
  }
  public int getEno() {
    return eno;
  }
  public void setEno(int eno) {
    this.eno = eno;
  }
  public String getEname() {
    return ename;
  }
  public void setEname(String ename) {
    this.ename = ename;
  }
  public Double getSalary() {
    return salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
  }
  @Override
  public String toString() {
    return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
  }

}
