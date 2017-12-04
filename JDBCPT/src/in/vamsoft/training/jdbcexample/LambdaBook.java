package in.vamsoft.training.jdbcexample;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book{
  
  int bid;
  String bname,author;
  double price;
  public Book() {
    super();
    // TODO Auto-generated constructor stub
  }
  public Book(int bid, String bname, String author, double price) {
    super();
    this.bid = bid;
    this.bname = bname;
    this.author = author;
    this.price = price;
  }
  public int getBid() {
    return bid;
  }
  public void setBid(int bid) {
    this.bid = bid;
  }
  public String getBname() {
    return bname;
  }
  public void setBname(String bname) {
    this.bname = bname;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  @Override
  public String toString() {
    return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]\n";
  }
}
public class LambdaBook {
  
  public static void main(String[] args) {
    
    Book b1=new Book(1,"Itf","people",400.00);
    Book b2=new Book(2,"The CompleteReference","john",1000.00);
    Book b3=new Book(3,"Daddy","sidny sheldon",1200.00);
    Book b4=new Book(4,"Ponniyan selvan","kalki",1400.00);
    List<Book> b=Arrays.asList(b1,b2,b3,b4);
    Collections.sort(b, (Book o,Book o1)->{ return o.getBname().compareTo(o1.getBname());});
    System.out.println(b);
          
  }

}
