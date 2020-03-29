package common;


public class BattleField {
    private Human A;
    private Human B;
    private boolean isATurn;
    
    public BattleField()
    {
        
    }
    
    public BattleField(Human A, Human B, boolean isATurn)
    {
        this.A = A;
        this.B = B;
        this.isATurn = isATurn;
    }
    
    public boolean EndGame()
    {
        if (A.isDead())
        {
            WinningAnnouncement(B);
            return true;
        }
        else if (B.isDead())
        {
            WinningAnnouncement(A);
            return true;
        }
        return false;
    }
    
    public void Fight()
    {
        while(!EndGame())
        {
            if (isATurn)
            {
                A.Attack(B);
            }
            else
            {
                B.Attack(A);
            }
            ShowWarriorInfo();
            ChangeTurn();
        }
    }
    
    public void WinningAnnouncement(Human X)
    {
        System.out.println(X.getName() + " is the winner");
    }
    
    public void ChangeTurn()
    {
        isATurn = !isATurn;
    }
    
    public void ShowWarriorInfo()
    {
        A.ShowInfo();
        B.ShowInfo();
    }
    
}