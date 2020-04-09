
package Common;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private float point;
    private String key;
    
    public Book (float p, String k)
    {
        this.point = p;
        this.key = k;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getPoint() {
        return point;
    }
    public void showBookInfo()
    {
        System.out.println("------Book Info------");
        System.out.println("Book point: " + this.point);
        System.out.println("Book key: " +this.key);
        System.out.println("---------------------");
    }
    
    
    
    
    
    
    
}
