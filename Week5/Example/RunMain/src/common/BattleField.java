
package common;

public class BattleField {
    private Character hero;
    private Character monster;
    private boolean isHeroTurn;
    
    public BattleField(Character heroName, Character monsterName, boolean turn)
    {
        this.hero = heroName;
        this.monster = monsterName;
        this.isHeroTurn = turn;
    }
    public void getWinner(Character X)
    {
        System.out.println(X.getCharName() + " won!");
    }
    public boolean endGame()
    {
        if(hero.isDead())
        {
            getWinner(monster);
            return true;
        }
        if(monster.isDead())
        {
            getWinner(hero);
            return true;
        }
        return false;
    }
    public void changeTurn()
    {
        this.isHeroTurn = !isHeroTurn;
    }
    public void Fight()
    {
        while(!endGame())
        {
            attack();
        }
    }
    public void attack()
    {
        if(isHeroTurn)
            {
                System.out.println("======= HERO'S TURN =======");
                hero.showInfo();
                hero.showSkill();
                Skill heroSkill = hero.doSkill();
                monster.receiveDamge(heroSkill);
                changeTurn();
            }
            else
            {
                System.out.println("======= MONSTER'S TURN =======");
                monster.showInfo();
                monster.showSkill();
                Skill monsterSkill = monster.doSkill();
                hero.receiveDamge(monsterSkill);
                changeTurn();
            }
    }
    
    
   
}
