
package Common;

public class Knight {
    private String name;
    private int HP;
    private int MP;
    
    public Knight(int HP, int MP)
    {
        this.HP = HP;
        this.MP = MP;
    }
    public void ShowInfo()
    {
        System.out.println("HP = " + HP);
        System.out.println("MP = " + MP);
        System.out.println("------------");
    }
    
    public void Heal()
    {
        if(MP >= 50)
        {
            System.out.println("Healing up!");
            MP -=50;
            HP += 30;
        }
        else
        {
            System.out.println("Not enough mana!");
        }
        
    }
}

