package in.vamsoft.training.trainer;

/**
 * @author vamsoft
 *
 */
public class SingletonClass {

  private static SingletonClass singletonclass;

  public SingletonClass() {
    super();

  }

  public static SingletonClass getInstance() {
    if (singletonclass == null) {
      singletonclass = new SingletonClass();
    }
    return singletonclass;
  }

}
