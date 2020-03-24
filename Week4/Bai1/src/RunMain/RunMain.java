
package RunMain;

import Common.Person;

public class RunMain {

    
    public static void main(String[] args) {
        Person SonNghien = new Person();
        Person TuBueDue = new Person();
        SonNghien.setAge(15);
        SonNghien.setHobby("chơi điện tử");
        SonNghien.setName("Nguyễn Văn Sơn");
        SonNghien.setSex("Nam");
        TuBueDue.setAge(50);
        TuBueDue.setHobby("hất cùn");
        TuBueDue.setName("Trần Văn Tú");
        TuBueDue.setSex("Male");
        
        System.out.println("Tên: " + SonNghien.getName() + "\nGiới tính: " + SonNghien.getSex() + "\nTuổi: " +SonNghien.getAge() + "\nSở thích: "+ SonNghien.getHobby());
        
        System.out.println("\nTên: " + TuBueDue.getName() + "\nGiới tính: " + TuBueDue.getSex() + "\nTuổi: " +TuBueDue.getAge() + "\nSở thích: "+ TuBueDue.getHobby());
    }
    
}
