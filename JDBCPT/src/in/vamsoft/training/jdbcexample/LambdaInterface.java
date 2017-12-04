package in.vamsoft.training.jdbcexample;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
  
  public static void main(String[] args) {
    
    Predicate<Integer> evenorodd=(x)->x%2==0?true:false;
    System.out.println("Is 10 even or odd:"+(evenorodd.test(10)?"10 is even":"10 is odd"));
    
    Consumer<String> updisp=str->System.out.println(str.toUpperCase());
    updisp.accept("Welcome to vamsoft");
    
    Function<String, Integer> flength=(str)->str.length();
    System.out.println("length of the Chennai"+flength.apply("Chennai"));
    
    Supplier<String> getdayofweek=()->LocalDate.now().getDayOfWeek().name();
    System.out.println("Today is:"+ getdayofweek.get());
  }

  
}
