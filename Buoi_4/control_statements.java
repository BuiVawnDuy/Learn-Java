package Buoi_4;

public class control_statements {
    public static void main(String[] args) {
        // if-else statements
        // if statement/if...else statement/if... else if...else statement
        // switch..case

        //Example: if...else statement
        int age = 18;
        if(age > 18){
            System.out.println("Ban du tuoi bau cu");
        }
        else if(age >= 15 && age <= 18){
            System.out.println("Ban chua du tuoi di xe may");
        }
        else{
            System.out.println("Ban chua du tuoi bau cu");
        }

        //Example: switch..case
        switch (age) {
            case 18:
                System.out.println("Ban du tuoi bau cu");
            case 15:case 16:case 17:
                System.out.println("Ban chua du tuoi di xe may");
            default:
                System.out.println("Ban chua du tuoi bau cu");
        }

        String name = "";
    }
}
