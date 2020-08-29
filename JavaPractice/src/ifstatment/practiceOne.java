package ifstatment;

import java.util.Scanner;

public class practiceOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("print your greade: ");

        int n = scan.nextInt();

        //System.out.println(n);

       // if(n>= 90 && n<=100){
           // System.out.println("A+");
       // }

        //if(true){
            //System.out.println("A+");
       // }

       // if(false){
            //System.out.println("A+");
       // }
        if (n>100){
            System.out.println();
        }
        if(n>= 90 && n<=100){
            System.out.println("A+");
        }else if (n>= 80 && n<90){
            System.out.println("A");
        }else if (n>= 70 && n<80){
            System.out.println("B");
        }else if(n>=60 && n<70){
            System.out.println("c");
        }else{
            System.out.println("Congratulation you successfully Failed :),");
        }



    }

}
