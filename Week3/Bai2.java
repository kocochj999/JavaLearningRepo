package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) 
    {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        int sum = 0;
        
        
        for(int index = 0; index < a.length(); index++)
        {
            if(a.charAt(index)>47 && a.charAt(index) <58)
            {
                sum = sum + a.charAt(index)-48;
            }
        }
        System.out.println(sum);
    }
    
}
