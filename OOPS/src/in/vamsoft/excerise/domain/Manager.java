package in.vamsoft.excerise.domain;
import java.lang.NullPointerException;

public class Manager  extends Employee {

  private String deptname;
  
  private Employee[] staff;
  private static int empCount;


  @SuppressWarnings("static-access")
  public Manager() {
    super();
    this.staff=new Employee[20];
    this.empCount=0;
    
  }
  
    public Manager(int empid, String name, String ssn, double salary, String deptname) {
    super(empid, name, ssn, salary);
    this.deptname = deptname;
  }

    @SuppressWarnings("static-access")
    public boolean addEmployee(int empId, String name,String ssn,double salary) {
      
      if(findemployee(empId)==true) {
        System.out.println("employee already exists");
        return false;
      }else {
      this.staff[empCount]=new Employee(empId, name, ssn, salary);
      this.empCount++;
      return true;
      }
      
    }
    public boolean  findemployee(int emp) {
      System.out.println("Manager.findemployee()");
      boolean temp = false;
      for(int i=0;i<20;i++) {
        if(this.staff[i].getEmpid() == emp) {
//          System.out.println("exists");
          temp=true;
        } else {
//          System.out.println("no");
          temp=false;
        }
      }
      return temp;          
    }

  public String getDeptname() {
    return deptname;
  }

  
  public void printManagerDetails() {
    for(int i=0;i<20;i++) {
      this.staff[i].printEmployee();
    }
  }
  
}
