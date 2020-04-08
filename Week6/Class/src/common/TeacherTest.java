
package common;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class TeacherTest {
    private int n;
    private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    Scanner sc = new Scanner(System.in);
    private int option = 0;
    public void testTeacher()
    {
        while (true)
        {   
            System.out.println("============== MENU =============");
            System.out.println("1. Input teachers: ");
            System.out.println("2. Display all teachers' information: ");
            System.out.println("3. Display teacher with highest actually received salary: ");
            System.out.println("4. Exit: ");
            System.out.println("==================================");

            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                    
                    Option1();
                    break;
                
                case 2:
                    Option2();
                    break;
                    
                case 3:
                    Option3();
                    break;
                    
                case 4:
                    return;
                
            }
        }
        
        
    }
    public void Option1()
    {
        
        System.out.print("Input number of teachers: ");
        n = sc.nextInt();
        int cnt =0;
        while(cnt <n)
            
        {
            Teacher tch = new Teacher();
            tch.inputInfo();
            teacherList.add(tch);
            cnt++;
        }
    }
    public void Option2()
    {
        for(Teacher tch: teacherList)
        {
            tch.showInfo();
            System.out.println("---------------");
        }
    }
    public static Comparator<Teacher> salaryComparator = new Comparator<Teacher>()
    {
        @Override
        public int compare(Teacher tch1, Teacher tch2)
        {
            return Double.compare(tch1.salary(), tch2.salary());
        }
    };
    public ArrayList<Teacher> getSalaryList (ArrayList<Teacher> list)
    {
        Collections.sort(list, salaryComparator);
        return list;
    }
    public void Option3()
    {
        ArrayList<Teacher> teacherListSortedBySalary = getSalaryList(teacherList);
        teacherListSortedBySalary.get(0).showInfo();
        System.out.println("Salary per month: " + teacherListSortedBySalary.get(0).salary());
    }
}
