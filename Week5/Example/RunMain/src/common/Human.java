/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author ADMIN
 */
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
    public boolean isDead()
    {
        return this.HP <= 0;
    }
}
