
package common;

public class Skill {
    private String skillName;
    private int mpLost;
    private int dmg;
    private int arp;
    
    public Skill(String name,int mp, int dmg, int arp)
    {
        this.skillName = name;
        this.mpLost = mp;
        this.dmg = dmg;
        this.arp = arp;
    }

    public void setArp(int arp) {
        this.arp = arp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setMpLost(int mpLost) {
        this.mpLost = mpLost;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getArp() {
        return arp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getMpLost() {
        return mpLost;
    }

    public String getSkillName() {
        return skillName;
    }
    
    
}
