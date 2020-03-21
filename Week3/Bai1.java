package javaapplication1;
import java.util.Scanner;

public class Bai1 {

    
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int[] a;
        a = new int[n];
        System.out.println("Nhap a: ");
        for( int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
            
        }
        for(int i = 0;i<n;i++)
        {
            for(int k = i+1; k<n; k++)
            {
                if(a[i]<a[k])
                {
                    int x = a[i];
                    a[i] = a[k];
                    a[k] = x;
                }
            }
        }
        System.out.println(a[2]);
    }
    
}
