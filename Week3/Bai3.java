package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void LuaChon1 (int[] a, int n)
    {
        
        
        
        
        
        System.out.println("Nhập mảng a:");
        for (int i= 0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
    }
    public static void LuaChon2 (int[] a)
    {
        System.out.println(" Mảng bạn vừa nhập là: ");
        for (int i = 0; i < a.length; i++)
        {
            
            System.out.print(a[i] + " ");
        }
    }
    public static void LuaChon3(int[] a)
    {
        int k;
        int x;
        System.out.print(" Nhập vị trí k:");
        k = sc.nextInt();
        System.out.print(" Nhập giá trị của vị trí k: ");
        x = sc.nextInt();
        for(int i = a.length-1; i >= k;i--)
        {
            a[i] = a[i-1];
        }
        a[k] = x;
        
        
        
    }
    public static void LuaChon4(int[] a)
    {
        int k;
        System.out.print(" Nhập vị trí k:");
        k = sc.nextInt();
        for(int i=k;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1] = 0;
        
    }
    public static void LuaChon5(int[] a, int n)
    {
        
        int i = 0;
        int j = n-1;
        while (i <= n/2)
        {
            int x = a[i];
            a[i] = a[j];
            a[j] = x;
            i++;
            j--;
        }
    }
    public static void LuaChon6(int[] a)
    {
        System.out.print("Sô chia hết cho a[1] là: ");
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] % a[1] == 0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
       
    public static void main(String[] args) 
    {
        int n;
        int[] a;
        int luaChon = 1;
        System.out.print("Nhập n: ");                  
        n = sc.nextInt();
        a = new int[n+1];    
        while (luaChon != 7)
        {
            System.out.println("\n Hãy chọn một lựa chọn (1-7): ");
            System.out.println("1. Tạo và nhập mảng mới với n số nguyên");
            System.out.println("2. Hiện thị mảng vừa tạo");
            System.out.println("3. Thêm một phần tử vào vị trí k");
            System.out.println("4. Xóa một phần tử ở vị trí k");
            System.out.println("5. Đảo ngược mảng");
            System.out.println("6. Hiện thị số a[1] và các số chia hêt cho a[1]");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            luaChon = sc.nextInt();
            
            
                
            switch(luaChon)
            {
                case 1:
                    
                    LuaChon1(a,n);
                    break;
                case 2:
                    
                    LuaChon2(a);
                    break;
                    
                case 3:
                   
                    LuaChon3(a);
                    break;
                case 4:
                    LuaChon4(a);
                    break;
                    
                case 5:
                    LuaChon5(a,n);
                    break;
                    
                case 6:
                    LuaChon6(a);
                    break;
                case 7:
                    luaChon = 7; 
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy nhập lại");
                    
                    
            } 
        }
              
    }
    
    
    
}
