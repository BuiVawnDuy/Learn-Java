package Buoi_4;

public class loop {
    public static void main(String[] args) {
        // for
        // while
        // do...while
        // for...each

        //for loop
        // for(int i=0;i<5;i++){
        //     //statement
        // }

        // int i = 0;
        // for(;i<5;i++){
        //     //statement
        // }

        // for(;;){
        //     if(i<5) break;
        //     i++;
        // }

        // for(int j=0,k=5;j<k;j++,k--){
        //     //statement
        // }

        // //while loop
        // while(i<5){
        //     //statement
        //     i++;
        // }

        // String quitKey = "";
        // while(true){
        //     if(quitKey.equals("q"))
        //         break;
        // }

        // //do...while loop
        // do{
        //     //statement
        //     i++;
        // }while(i<5);

        // //for...each loop
        // Student[] values = new Student[3];
        // values[0] = new Student();
        // values[1] = new Student();
        // values[2] = new Student();

        // for(Student ele : values){
        //     System.out.println(ele);
        // }

        //nested loop
        int m = 5, n = 4;
        for(int i=0;i<m;i++){
            for(int j = 0; j<n;j++){
                System.out.printf("i = %d\tj = %d\n",i,j);
            }
            System.out.println();
        }
    }
}
