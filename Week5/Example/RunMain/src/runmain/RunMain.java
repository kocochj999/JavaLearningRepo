
package runmain;

import common.BattleField;
import common.Character;
import common.Skill;

public class RunMain {

    public static void main(String[] args) {
        
        Character Archer = new Character("Duy","Archer",300, 150, 20);
        Character Demon = new Character("Tung","Demon",400,0,30);
        
        Skill ArcherQ = new Skill ("Attack",0,50,10);
        Skill ArcherW = new Skill ("PowerShot", 40, 100, 30);
        
        Skill DemonQ = new Skill ("Attack", 0, 60, 10);
        Skill DemonR = new Skill ("Roar", 0, 150, 20);
        
        Archer.addSkill(ArcherQ);
        Archer.addSkill(ArcherW);
        Demon.addSkill(DemonQ);
        Demon.addSkill(DemonR);
        
        BattleField bf = new BattleField(Archer,Demon,true);
        bf.Fight();
        
        
    }
    
}
