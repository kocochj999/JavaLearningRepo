
package Common;

import java.util.Scanner;

public class Student {
    private String name;
    private String code;
    private int age;
    
    Scanner sc = new Scanner(System.in);
    public void InputInfo()
    {
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập MSSV: ");
        code = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }
    public void ShowInfo()
    {
        System.out.println("\nTên: "+ name + ".MSSV: "+code+ ".Tuổi: " +age);
    }
    
    
}
