package Bookshop;
import java.util.ArrayList;
public class Book{
    
    // Attribute 
    private String id;
    private String title;
    private String pages;
    private ArrayList<String> book;

    //Default Constructor
    public Book()
    {  book = new ArrayList<String>();  }

    public Book(String title,String pages,String id){
       // System.out.println("Welcome to BookShop");
        this.title=title;
        this.pages=pages;
        this.id=id;
    } 

    //Method
    public void setID(String id){
         this.id=id;

    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPages(String pages){
        this.pages=pages;
    }

    public void displaybook(){
        System.out.println("ID = "+this.id);
        System.out.println("Title = "+this.title);
        System.out.println("Pages = "+this.pages);
        System.out.println("-------------------------------------");

    }

    public String getTitle(){
        return this.title;
    }
    public String getPages(){
        return this.pages;
    }

    public void listNotes()
  { for (String note : book)
      System.out.println(note);
  }

  public void storeNote(String note)
  {  book.add(note); }

}
