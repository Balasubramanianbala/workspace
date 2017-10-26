package in.vamsoft.excerise.domain;

public class Director extends Manager {

  private double budget;

  public Director(int empid, String name, String ssn, Double salary, String deptname, double budget) {
    super(empid, name, ssn, salary, deptname);
    this.budget = budget;
  }

  public double getBudget() {
    return budget;
  }
  

}
