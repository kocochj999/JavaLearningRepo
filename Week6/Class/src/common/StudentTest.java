
package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
    private int n;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    private int option = 0;
    public void Test()
    {
        while (true)
        {   
            System.out.println("============== MENU =============");
            System.out.println("1. Input students: ");
            System.out.println("2. Display all students' information: ");
            System.out.println("3. Display students with lowest and highest average point: ");
            System.out.println("4. Search student by student code: ");
            System.out.println("5. Display students ordered from A-Z: ");
            System.out.println("6. Display students that have scholarship, ordered from A-Z: ");
            System.out.println("7. Exit:");
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
                    Option4();
                    break;
                case 5:
                    Option5();
                    break;
                    
                case 6:
                    Option6();
                    break;
                    
                case 7:
                    return; 
            }
        }
        
        
    }
    public void Option1()
    {
        System.out.print("Input number of students: ");
        n = sc.nextInt();
        int cnt =0;
        while (cnt<n)
        {
            Student std = new Student();
            std.inputInfo();
            studentList.add(std);
            cnt++;
        }
    }
    public void Option2()
    {
        for(Student std:studentList)
        {
            std.showInfo();
            System.out.println("-----------------------------");
        }
    }
    public void Option3()
    {
        double min = 10;
        double max = 0;
        Student stdmin = new Student();
        Student stdmax = new Student();
        
        for (Student std: studentList)
        {
            if(std.getAvgScore() < min)
            {
                min = std.getAvgScore();
                
                stdmin.setStudentCode(std.getStudentCode());
                stdmin.setAvgScore(std.getAvgScore());
                stdmin.setEmail(std.getEmail());
                stdmin.setAddress(std.getAddress());
                stdmin.setName(std.getName());
                stdmin.setAge(std.getAge());
                stdmin.setDateOfBirth(std.getDateOfBirth());
            }
            if(std.getAvgScore() >max)
            {
                max = std.getAvgScore();
                
                stdmax.setStudentCode(std.getStudentCode());
                stdmax.setAvgScore(std.getAvgScore());
                stdmax.setEmail(std.getEmail());
                stdmax.setAddress(std.getAddress());
                stdmax.setName(std.getName());
                stdmax.setAge(std.getAge());
                stdmax.setDateOfBirth(std.getDateOfBirth());
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Student with the lowest average point is: ");
        stdmin.showInfo();
        System.out.println("-----------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Student with the highest average point is: ");
        stdmax.showInfo();
        System.out.println("-----------------------------");
    }
    
    public Student getStudentByCode()
    {
        int searchcode;
        System.out.print("Enter a student code: ");
        searchcode = sc.nextInt();
        for(Student std: studentList)
        {
            if (searchcode == std.getStudentCode())
            {
                return std;
            }
        }
        return null;
    }
    public void Option4()
    {
        Student std = getStudentByCode();
        if(std != null)
        {
            std.showInfo();
            System.out.println("-----------------------------");
        }
        else
        {
            System.out.println("No student available! ");
        }
    }
    public static Comparator<Student> nameComparator = new Comparator<Student>()
            {
                @Override
                public int compare(Student std1, Student std2)
                {
                    return (int) (std1.getName().compareTo(std2.getName()));
                }
            };
    
    public ArrayList<Student> getSortedStudentByName(ArrayList<Student> list)
    {
        Collections.sort(list, nameComparator);
        return list;
    }
    
    public void Option5()
    {
        ArrayList<Student> sortedStudentList = getSortedStudentByName(studentList);
        for(Student std: sortedStudentList)
        {
            std.showInfo();
            System.out.println("-----------------------------");
        }
    }
    public static Comparator<Student> ageComparator = new Comparator<Student>()
    {
        @Override
        public int compare(Student std1, Student std2)
        {
            return Double.compare(std1.getAvgScore(),std2.getAvgScore());
        }
    };
    public ArrayList<Student> getSortedStudentByAge(ArrayList<Student> list)
    {
        Collections.sort(list, ageComparator);
        Collections.reverse(list);
        return list;
        
    }
    
    public void Option6()
    {
        ArrayList<Student> scholarshipStdList = new ArrayList<Student>();
        for(Student std: studentList)
        {
            if(std.getAvgScore() >= 8)
            {
                scholarshipStdList.add(std);
            }
        }
        getSortedStudentByAge(scholarshipStdList);
        for(Student std: scholarshipStdList)
        {
            std.showInfo();
            System.out.println("-----------------------------");
        }
    }
    
}
