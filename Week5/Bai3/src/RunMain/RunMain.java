
package RunMain;

import Common.Human;


public class RunMain {

    
    public static void main(String[] args) {
        Human A = new Human("Duy", 200, 15);
        Human B = new Human("Tung", 300, 10);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------"); 
        //Round 1
        A.Attack(B);
        A.ShowInfo();
        B.ShowInfo();
        B.Attack(A);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------");    
        //Round 2
        A.Attack(B);
        A.ShowInfo();
        B.ShowInfo();
        B.Attack(A);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------"); 
        //Round 3
        A.Attack(B);
        A.ShowInfo();
        B.ShowInfo();
        B.Attack(A);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------"); 
        //Round 4
        A.Attack(B);
        A.ShowInfo();
        B.ShowInfo();
        B.Attack(A);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------"); 
        //Round 5
        A.ShowInfo();
        B.ShowInfo();
        B.Attack(A);
        A.ShowInfo();
        B.ShowInfo();
        System.out.println("-------"); 
        //Result
        if(A.getHP()>B.getHP())
        {
            System.out.println(A.getName() + " won!");
        }
        else if (A.getHP()<B.getHP())
        {
            System.out.println(B.getName() +" won!");
        }
        else
        {
            System.out.println("It's a draw!");
        }
        
        
        
      
        
    }
    
}
