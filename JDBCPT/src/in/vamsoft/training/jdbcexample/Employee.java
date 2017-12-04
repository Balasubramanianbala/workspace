package in.vamsoft.training.jdbcexample;

import java.time.LocalDate;

public class Employee {
  
  int empid;
  String fname;
  double salary;
  LocalDate doj;
  int deptid;

  
  public Employee() {
    super();
    
  }
  public Employee(int empid, String fname, double salary, LocalDate doj, int deptid) {
    super();
    this.empid = empid;
    this.fname = fname;
    this.salary = salary;
    this.doj = doj;
    this.deptid = deptid;
  }
  @Override
  public String toString() {
    return "Employee [empid=" + empid + ", fname=" + fname + ", salary=" + salary + ", doj=" + doj + ", deptid="
        + deptid + "]";
  }
  public int getEmpid() {
    return empid;
  }
  public void setEmpid(int empid) {
    this.empid = empid;
  }
  public String getFname() {
    return fname;
  }
  public void setFname(String fname) {
    this.fname = fname;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public LocalDate getDoj() {
    return doj;
  }
  public void setDoj(LocalDate doj) {
    this.doj = doj;
  }
  public int getDeptid() {
    return deptid;
  }
  public void setDeptid(int deptid) {
    this.deptid = deptid;
  }
 
}
