
package Common;

import java.util.Scanner;

public class Dog {
    private String name;
    private int MP = 100;
    
    
    public void InputName()
    {
        System.out.print("Nhập tên con chó:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    
    public void ShowMP()
    {
        System.out.println(name +" còn"+ MP +" MP");
        
    }
    public void Bark()
    {
        
        if(name == null)
        {
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
        else
        {
            System.out.println(name + " sủa");
            MP -=20;
        }
    }
}
