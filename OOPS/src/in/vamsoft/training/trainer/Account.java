package in.vamsoft.training.trainer;

public class Account {

  double bal;

  public Account(double bal) {
    super();
    this.bal = bal;
  }

  public double getBal() {
    return bal;
  }

  public void withdraw(double amt) {
    if ((bal - amt) >= 0) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
      bal -= amt;
      System.out.println(
          "withdrawl by thread" + Thread.currentThread().getName() + "Successfull . the balance is" + getBal());

    } else {
      System.out.println("Insufficient balance for thread" + Thread.currentThread().getName() + "Balance" + getBal());
    }
  }
}
