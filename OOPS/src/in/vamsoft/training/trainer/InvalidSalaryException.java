package in.vamsoft.training.trainer;

public class InvalidSalaryException extends Exception {
  
  enum salary{
    Min,Max;
  }
  
  salary salerrorcode;

  public InvalidSalaryException(String msg,salary salerrorcode) {
    super(msg);
    this.salerrorcode = salerrorcode;
  }

  public salary getSalerrorcode() {
    return salerrorcode;
  }

  

  

}
