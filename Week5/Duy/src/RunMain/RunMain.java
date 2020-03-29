
package RunMain;

import Common.Human;
import Common.BattleField;


public class RunMain {

    
    public static void main(String[] args) {
        Human A = new Human("Duy", 400, 45);
        Human B = new Human("Tung", 300, 45);
        
        BattleField Battle = new BattleField(A,B);
        
        //Battle
       Battle.Fight();
       Battle.CheckWinner();
        
        
        
      
        
    }
    
}
