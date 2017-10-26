package in.vamsoft.training.trainer;

public class Employeedemo implements Comparable<Employeedemo> {

  int eno;
  String ename;
  double sal;

 /* @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + eno;
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
    Employeedemo other = (Employeedemo) obj;
    if (eno != other.eno) {
      return false;
    }
    return true;
  }
*/
  /**
   * @param eno.
   * @param ename.
   * @param sal.
   */
  public Employeedemo(int eno, String ename, double sal) {
    super();
    this.eno = eno;
    this.ename = ename;
    this.sal = sal;
  }

  @Override
  public String toString() {
    return "Employeedemo [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]\n";
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

  public double getSal() {
    return sal;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

  @Override
  public int compareTo(Employeedemo o) {
    if (this.eno > o.eno) {
      return 1;
    } else if (this.eno < o.eno) {
      return -1;
    } else {
      return 0;
    }
  }

}
