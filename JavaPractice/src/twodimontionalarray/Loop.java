package twodimontionalarray;

import java.util.Scanner;

public class Loop {
    public static void inputOne(){
        Scanner input = new Scanner(System.in);
        int[][] num1 = new int[3][3];
        System.out.println("please enter the numbers for first array: ");
      for(int row =0 ; row <num1.length; row++) {
          for(int col = 0; col< num1.length; col++ ){
              num1[row][col] = input.nextInt();
          }

      }

        System.out.println("num1: ");
      for(int row=0; row<3; row++){
          for(int col=0; col<3; col++){
              System.out.println(" " +num1[row][col]);
          }
          System.out.println();
      }
    }
    public static void inputTwo(){
        Scanner input1 = new Scanner(System.in);
        int [][] num2 = new int[3][3];
        System.out.println("Please enter the value for 2nd array: ");
        for(int row=0; row <num2.length; row++){
            for(int col=0; col<num2.length; col++){
                num2[row][col] = input1.nextInt();
            }
        }

        System.out.println("num2 = ");
        for(int row=0; row< 3; row++){
            for ( int col =0; col<3; col++){
                System.out.print("   "+num2[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Loop obj = new Loop();
        //obj.inputOne();
        obj.inputTwo();
        //int sum[][] = obj.inputOne() + obj.inputTwo();

    }


}
