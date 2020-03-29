
package Common;


public class BattleField {
    private Human A;
    private Human B;
    
    public BattleField(Human A, Human B)
    {
        this.A = A;
        this.B = B;
    }
    public boolean EndGame()
    {
        return (A.DeadOrNot() || B.DeadOrNot());
    }
    
    public void Fight()
    {
        while(!EndGame())
        {
            A.Attack(B);
            B.Attack(A);
            A.ShowInfo();
            B.ShowInfo();
        }
    }
    
    public void CheckWinner()
    {
        if(A.DeadOrNot())
        {
            System.out.println(B.getName() + " won!");
        }
        else
        {
            System.out.println(A.getName() + " won!");
        }
        
    }
    
}
