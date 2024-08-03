package Buoi_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        // <kieu du lieu> ten bien [=][value];
        int intNum;
        int num = 5;
        double dblNum;
        double value = 0.0;
        Student st = new Student();
        List<Integer> intNums = new ArrayList<Integer>();
        intNums.add(1);
        intNums.add(2);
        intNums.add(3);
        intNums.add(4);
        intNums.add(5);

        int i = intNums.size();
        do{
            System.out.println(intNums.get(i));
            i--;
        }while(i > 0);

        while(i > 0){
            System.out.println(intNums.get(i));
            i--;
        }

        for(int a : intNums){
            System.out.println(a);
        }
    }
}

class Person{
    protected String address;
}

class Student extends Person{
    // access modifier: public, private, protected,...
    private int id;
    private String name;
    private LocalDate birthday;
    private boolean gender;

    Student(){} //constructor mặc định
    Student(int id, String name, LocalDate birthday, boolean gender){ //construct có tham số
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = "";
    }
    Student(Student st){
        this.id = st.id;
        this.name = st.name;
        this.birthday = st.birthday;
        this.gender = st.gender;
    }

    //Getter va Setter
    LocalDate getBirthday(){
        return this.birthday;
    }

    void setBirthday(LocalDate b){
        this.birthday = b;
    }

    void displayInfo(){
        System.out.println(id + " " + name);
    }
}
