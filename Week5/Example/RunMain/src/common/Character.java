
package common;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    private String charName;
    private String charJob;
    private int HP;
    private int MP;
    private int armor;
    public ArrayList<Skill> skillList = new ArrayList<Skill>(); 
    
    public Character(String name, String job, int hp,int mp,int amr)
    {
        this.charName = name;
        this.charJob = job;
        this.HP = hp;
        this.MP = mp;
        this.armor = amr;
    }

    public String getCharName() {
        return charName;
    }
    public void showInfo()
    {
        System.out.println("HP= "+this.HP + "|MP = " + this.MP + "|Armor = " +this.armor);
    }
    public void showSkill()
    {
        int count = 0;
        for(Skill skill: skillList)
        {
            System.out.println(count + "- Skill: " + skill.getSkillName() +"|MP cost: " +skill.getMpLost() + "|Damge: " +skill.getDmg() + "|Armor Piercing: " +skill.getArp());
            count ++;
        }
    }
    public boolean isDead()
    {
        return (this.HP <= 0);
    }
    public void receiveDamge(Skill skill)
    {
        this.HP -= skill.getDmg() + skill.getArp() - this.armor;
    }
    public boolean doesSkillAlreadyExist(String skillName)
    {
        for(Skill skill: skillList)
        {
            if(skill.getSkillName().equals(skillName))
            {
                return true;
            }
        }
        return false;
    }
    public void addSkill(Skill skill)
    {
        if(!doesSkillAlreadyExist(skill.getSkillName()))
        {
            skillList.add(skill);
        }
    }
    public Skill getSkillByNumber(Integer skillNum)
    {
        if(skillNum < skillList.size())
        {
            return skillList.get(skillNum);
        }
        return null;
    }
    public Skill doSkill()
    {
        Integer selection;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Pick a skill: ");
            selection = sc.nextInt();
            Skill newSkill = getSkillByNumber(selection);
            if( getSkillByNumber(selection) == null)
            {
                System.out.println("Skill unavailable");
            }
            else if(this.MP < newSkill.getMpLost())
            {
                System.out.println("Not enough mana");
            }
            else
            {
                this.MP -= newSkill.getMpLost();
                return newSkill;
            }
        }
    }
    
   
}

