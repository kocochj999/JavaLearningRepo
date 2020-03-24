
package Common;

import java.util.Scanner;

public class JavaClass {
    private Student stdList[];
    private int ratingStar;
    
    Scanner sc = new Scanner(System.in);
    private void InputStudent()
    {
        int n;
        System.out.print("Nhập số học sinh: ");
        n = sc.nextInt();
        stdList = new Student[n];
        for (int i=0;i<n;i++)
        {
            stdList[i] = new Student();
            stdList[i].InputInfo();
        } 
    }
    private void ShowStudent()
    {
        for(int i =0; i<stdList.length; i++)
        {
            stdList[i].ShowInfo();
        }
    }
    String leaderName;
    public void InputClassInfo()
    {
        System.out.print("Nhập tên leader: ");
        leaderName = sc.nextLine();
        System.out.print("Đánh giá chất lượng: ");
        ratingStar = sc.nextInt();
        InputStudent();
    }
    public void ShowClassInfo()
    {
        System.out.println("Tên leader: " + leaderName);
        System.out.println("Điểm đánh giá: "+ratingStar);
        ShowStudent();
    }
}
