package Buoi_1;

import java.util.Scanner;

public class Bai5 {

    public static String convertDayToVietNam(int day){
       switch (day) {
        case 2:
            return "Thu Hai";
        case 3:
            return "Thu Ba";
        case 4:
            return "Thu Tu";
        case 5:
            return "Thu Nam";
        case 6:
            return "Thu Sau";
        case 7:
            return "Thu Bay";
        case 8:
            return "Chu Nhat";
        default:
            break;
       }
       return "";
    }

    public static String convertDayToMy_ChauAu(int day){
        switch (day) {
         case 2:
             return "Monday";
         case 3:
             return "Tuesday";
         case 4:
             return "Wednesday";
         case 5:
             return "Thursday";
         case 6:
             return "Friday";
         case 7:
             return "Saturday";
         case 8:
             return "Sunday";
        }
        return "";
     }

    public static String convertMonthToMy_ChauAu(int month){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.printf("Viet Nam: %s, ngay %d thang %d nam %d\n", convertDayToVietNam(day), date, month, year);
        System.out.printf("My: %s, %s %d, %d\n", convertDayToMy_ChauAu(day), convertMonthToMy_ChauAu(month), date, year);
        System.out.printf("Chau Au: %s %d %s %d", convertDayToMy_ChauAu(day), date, convertMonthToMy_ChauAu(month), year);
    }
}
