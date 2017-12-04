package in.vamsoft.training.jdbcexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Bookstream {
  
  public static void main(String[] args) {
    
    Book b1=new Book(1,"Itf","people",400.00);
    Book b2=new Book(2,"The CompleteReference","john",1000.00);
    Book b3=new Book(3,"Daddy","sidny sheldon",1200.00);
    Book b4=new Book(4,"Ponniyan selvan","kalki",1400.00);
    List<Book> mybooks=Arrays.asList(b1,b2,b3,b4);
    Stream<Book> books=mybooks.stream();
    //double tt=books.map(Book::getBname).forEach(System.out.println(toUppercase()));
    books.map(b->(b.getBname()).toUpperCase()).forEach(t->System.out.println(t));
  }

}
