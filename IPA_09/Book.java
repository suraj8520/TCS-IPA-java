public class Book{
  private int id;
  private int pages;
  private String title;
  private String author;
  private double price;

  Book(int id, int pages, String title, String author, double price){
    this.id = id;
    this.pages = pages;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public int getId(){
    return id;
  }

  public int getPages(){
    return pages;
  }

  public String getTitle(){
    return title;
  }

  public String getAuthor(){
    return author;
  }

  public double getPrice(){
    return price;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setPages(int pages){
    this.pages = pages;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setAuthor(String author){
    this.author = author;
  }

  public void setPrice(double price){
    this.price = price;
  }
}