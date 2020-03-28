
package Common;

import java.util.Scanner;

public class Student {
    private int mssv;
    private String name;
    private int age;
    private String classNum;
    
    Scanner sc = new Scanner (System.in);

    public String getName() {
        return name;
    }
    
    
    
    public void InputInfo()
    {
        System.out.print("\nNhập MSSV: ");
        mssv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi của sinh viên: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập lớp: ");
        classNum = sc.nextLine();
        
        
    }
    public void OutputInfo()
    {
        System.out.println("\nMSSV: " + mssv);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lớp: " + classNum);
    }
    
}
