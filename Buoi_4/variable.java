package Buoi_4;

import java.util.ArrayList;
import java.util.List;

public class variable {
    public static void main(String[] args) {
        //Data type:
        //- Primetive type: int, String, boolean, float, double, byte, short,...
        //- Reference type: Student, Teacher, Car,...
        //- Collection types: List, Hashtable, Set, Dictionary, Map
        
        //declare variables:
        // syntax: <data type> var_name [=] [value];

        int intNum = 0;
        double dblNum = 0.0;
        String str = "Hello world";
        boolean isCurrent = false;
        int otherIntNum;

        Student student1 = new Student();
        Student student2;

        List<Integer> intList1 = new ArrayList<Integer>();
        List<Integer> intList2;

        // String 0var1 = ""
        // int -var_name = 0
        // double var_name = 0.0
        // byte for = 1
    }
}

class Student{
    Student(){}
}
