
package Common;

public class Human {
    private String name;
    private int HP;
    private int dmg;
    
    public Human(String name, int HP, int dmg)
    {
        this.name = name;
        this.HP = HP;
        this.dmg = dmg;
                
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }
    
    
    public void ShowInfo()
    {
        System.out.println(this.name + " - HP: " + this.HP);
       
    }
    public void Attack(Human attacked)
    {
        System.out.println("\t" + name + " hit " + attacked.name);
        attacked.HP -= this.dmg;
    }
    public boolean DeadOrNot()
    {
        return this.HP <= 0;
    }
    
}
