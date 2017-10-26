package in.vamsoft.training.trainer;

public class Customer implements Comparable<Customer> {
  int cid;
  String cname;
  int mobno;
  String addr;

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  @Override
  public String toString() {
    return "Customer [cid=" + cid + ", cname=" + cname + ", mobno=" + mobno + ", addr=" + addr + "]\n";
  }



  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cid;
    result = prime * result + ((cname == null) ? 0 : cname.hashCode());
    result = prime * result + mobno;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Customer other = (Customer) obj;
    if (cid != other.cid)
      return false;
    if (cname == null) {
      if (other.cname != null)
        return false;
    } else if (!cname.equals(other.cname))
      return false;
    if (mobno != other.mobno)
      return false;
    return true;
  }

  public Customer(int cid, String cname, int mobno, String addr) {
    super();
    this.cid = cid;
    this.cname = cname;
    this.mobno = mobno;
    this.addr = addr;
  }

  public Customer() {
    super();
    // TODO Auto-generated constructor stub
  }

  public int getMobno() {
    return mobno;
  }

  public void setMobno(int mobno) {
    this.mobno = mobno;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public int compareTo(Customer o) {
    if (this.cid > o.cid) {
      return 1;
    } else if (this.cid < o.cid) {
      return -1;
    } else {
      return 0;
    }  }

}
