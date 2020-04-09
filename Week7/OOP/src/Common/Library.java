
package Common;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> bookList = new ArrayList<Book>();
    private char[] checker;
    
    public void addBook(Book book)
    {
        bookList.add(book);
    }
    public char[] getInputKey()
    {
        String input;
        System.out.print("Input key: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        checker = input.toCharArray();
        return checker;
    }
    
    public boolean filter (Book book, char[] ch)
    {
        int k = 0;
        for(int i =0; i < book.getKey().length();i++)
        {
            
            
            if(book.getKey().charAt(i) == ch[k])
            {
                if(k >= ch.length)
                {
                    k = ch.length -1;
                }
                else
                {
                    k++;
                }
            }
            else
            {
                if(k >= ch.length)
                {
                    k = ch.length -1;
                }
                else k=0;
            }
        }
        
        return k == (ch.length);
    }
    
    public void bookFilter()
    {
        char[] ch = getInputKey();
        for (Book book:bookList)
        {
            if(filter(book, ch))
            {
                book.showBookInfo();
            }
        }
    }
    
}
