import java.util.*;

public class Solution{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[4];
    for(int i = 0; i < 4; i++){
      int id = sc.nextInt();
      int pages = sc.nextInt();
      sc.nextLine();
      String title = sc.nextLine();
      String author = sc.nextLine();
      double price = sc.nextDouble();
      sc.nextLine();

      books[i] = new Book(id, pages, title, author, price);
    }
    String qTitle = sc.nextLine();
    Book maxPrice = findBookWithMaximumPrice(books);
    System.out.println(maxPrice.getId() + " " + maxPrice.getTitle());

    Book result = searchBookByTitle(books, qTitle);
    if(result == null){
      System.out.println("No book found with mentioned attribute");
    }else{
      System.out.println(result.getId());
      System.out.println(result.getPages());
      System.out.println(result.getTitle());
      System.out.println(result.getAuthor());
      System.out.println(result.getPrice());
    }
    
    sc.close();
  }

  public static Book findBookWithMaximumPrice(Book[] books){
    Book highest = books[0];
    for(Book b: books){
      if(b.getPrice() > highest.getPrice()) highest = b;
    }
    return highest;
  }

  public static Book searchBookByTitle(Book[] books, String title){
    
    for(Book b: books){
      if(b.getTitle().equals(title)) return b;
    }
    
    return null;
  }
}