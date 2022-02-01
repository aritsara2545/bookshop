package Bookshop;

public class Main{

    public static void main(String [] args){
            Book book = new Book();
            Book b1=new Book("Harry Potter", "431", "001");
            b1.displaybook();
            book.storeNote("Harry Potter");

            Book b2=new Book("TITANIC", "1223", "002");
            b2.displaybook();
            book.storeNote("TITANIC");

            Book b3=new Book("TITAN", "565", "003");
            b3.displaybook();
            book.storeNote("TITAN");

            System.out.println("list of all books");
            book.listNotes();
            
    }
}
