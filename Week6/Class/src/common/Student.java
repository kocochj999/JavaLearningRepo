/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Scanner;

/**
 *
 * @author Dee
 */
public class Student extends Person {
    
    
    private int studentCode;
    private double avgScore;
    private String email;

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
    @Override
    public void inputInfo()
    {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student code: ");
        this.studentCode = sc.nextInt();
        System.out.print("Input average score: ");
        this.avgScore = sc.nextDouble();
        sc.nextLine();
        System.out.print("Input email: ");
        this.email = sc.nextLine();
        
    }
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Student code: " + this.studentCode);
        System.out.println("Average score: " + this.avgScore);
        System.out.println("Email: " +this.email);
    }
    public boolean checkScholarship()
    {
        return (this.avgScore >= 8.0);
    }
    public int compareTo(Student std)
    {
        if(avgScore == std.avgScore)
        return 0;
        else if( avgScore > std.avgScore)
            return 1;
        else
            return -1;
    }
    
    
    
}
