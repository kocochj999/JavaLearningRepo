
package RunMain;

import Common.Book;
import Common.Library;
import java.util.ArrayList;





public class RunMain {

    
    public static void main(String[] args) {
        Book book1 = new Book(8.2f, "Detective");
        Book book2 = new Book(8.3f, "Detective");
        Book book3 = new Book(5.6f, "Action");
                
        Library library = new Library();
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        
        library.bookFilter();
    }
    
}
