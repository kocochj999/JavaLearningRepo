
package Common;

import java.util.Scanner;

public class Club {
    private Student stdList[];
    
    Scanner sc = new Scanner(System.in);
    public void InputClubInfo()
    {
        int n;
        System.out.print("Nhập số học sinh trong club: ");
        n = sc.nextInt();
        stdList = new Student[n];
        for( int i=0;i<n;i++)
        {
            stdList[i] = new Student();
            stdList[i].InputInfo();
        }
    }
    public void OutputClubInfo()
    {
        System.out.println("Thông tin Club:");
        for (Student stdList1 : stdList) {
            stdList1.OutputInfo();
        }
    }
    
    
    
    
}
