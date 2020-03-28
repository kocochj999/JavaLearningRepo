
package RunMain;

import Common.Human;


public class RunMain {

    
    public static void main(String[] args) {
        Human A = new Human("Duy", 400, 45);
        Human B = new Human("Tung", 300, 55);
        
        
        //Battle
        while(A.getHP()>0 && B.getHP()> 0)
        {
            A.Attack(B);
            B.Attack(A);
            A.ShowInfo();
            B.ShowInfo();
        }
        //Result
        if(A.getHP() > B.getHP())
        {
            System.out.println(A.getName() + " won!");
        }
        else if( A.getHP() < B.getHP())
        {
            System.out.println(B.getName() + " won!");
        }
        else
        {
            System.out.println("It's a draw!");
        }
        
        
      
        
    }
    
}
