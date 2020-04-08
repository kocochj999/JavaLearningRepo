
package common;

import java.util.Scanner;

public class Teacher extends Person {
    private String classTeaching;
    private double payPerHour;
    private double hourPerMonth;

    public void setClassTeaching(String classTeaching) {
        this.classTeaching = classTeaching;
    }

    public String getClassTeaching() {
        return classTeaching;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setHourPerMonth(double hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    public double getHourPerMonth() {
        return hourPerMonth;
    }
    
    
    public void inputInfo()
    {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input class teaching: ");
        this.classTeaching = sc.nextLine();
        System.out.print("Input salary per hour: ");
        this.payPerHour = sc.nextDouble();
        System.out.print("Input hour teach per month: ");
        this.hourPerMonth = sc.nextDouble();
    }
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Class: " + this.classTeaching);
        System.out.println("Pay per hour: " + this.payPerHour);
        System.out.println("Hour per month: " +this.hourPerMonth);
    }
    
    public Double salary()
    {
        if(this.classTeaching.equals("G") || this.classTeaching.equals("H") || this.classTeaching.equals("I") || this.classTeaching.equals("K"))
        {
            return (this.payPerHour * this.hourPerMonth);
        }
        if(this.classTeaching.equals("L") || this.classTeaching.equals("M"))
        {
            return ((this.payPerHour * this.hourPerMonth)+200000);
        }
        return null;
    }
    
    
    
    
}
