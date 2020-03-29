/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmain;

import common.BattleField;
import common.Human;

public class RunMain {

    public static void main(String[] args) {
        Human A = new Human("Duy", 400, 45);
        Human B = new Human("Tung", 300, 45);
        
        BattleField bf = new BattleField(A, B, true);
        bf.Fight();
    }
    
}
