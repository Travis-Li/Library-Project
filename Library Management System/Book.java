public class Book{
  private String isbn, name, author, category, status;
  
  public Book(String i, String n, String a, String c, String s){
    isbn = i;
    name = n;
    author = a;
    category = c;
    status = s;
  }
  
  public String getIsbn(){
    return isbn;
  }
  public String getName(){
    return name;
  }
  public String getAuthor(){
    return author;
  }
  public String getCategory(){
    return category;
  }
  public String getStatus(){
    return status;
  }
}
