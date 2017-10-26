package in.vamsoft.excerise.domain;

public class Manager extends Employee {

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
      this.staff[empCount]=new Employee(empId, name, ssn, salary);
      this.empCount++;
      return true;
      
    }
    public void findemployee(int emp) {
      System.out.println("Manager.findemployee()");
      
      for(int i=0;i<20;i++) {
        if(this.staff[i].getEmpid() == emp) {
          System.out.println("exists");
        } else {
          System.out.println("no");
        }
      }
      
      
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
