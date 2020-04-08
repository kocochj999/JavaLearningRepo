
package common;

import java.util.Comparator;
import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected String dateOfBirth;
    protected String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }
    
    
   
    
    
    public void inputInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Input date of birth: ");
        this.dateOfBirth = sc.nextLine();
        System.out.print("Input address: ");
        this.address = sc.nextLine();
    }
    public void showInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Date of birth: " +this.dateOfBirth);
        System.out.println("Address: " + this.address);
    }
    
            
    
}
