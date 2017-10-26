package in.vamsoft.training.trainer;

public class BankThread implements Runnable {

  Account a;
  double withdrawlamt;

  @Override
  public void run() {
    System.out.println("Balance for:" + Thread.currentThread().getName() + "" + a.getBal());
    synchronized (a) {
      a.withdraw(withdrawlamt);

    }

  }

  public BankThread(Account a, double withdrawlamt) {
    super();
    this.a = a;
    this.withdrawlamt = withdrawlamt;
  }

  public static void main(String[] args) {
    Account ac = new Account(1000);
    BankThread b = new BankThread(ac, 500);
    BankThread b1 = new BankThread(ac, 750);
    Thread t = new Thread(b, "thread 1");
    Thread t1 = new Thread(b1, "thread 2");
    t.start();
    t1.start();
  }
}
