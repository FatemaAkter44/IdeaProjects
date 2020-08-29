package java_class15;

import java.util.Scanner;

public class TwoDLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] id = new int[2][2];
        System.out.print("please enter the value for id: ");

        //for getting input for the matrix
        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    id[i][j] = scan.nextInt();
                }
            }
        }
        catch(Exception e ){
            e.printStackTrace();
        }

        System.out.println("id= ");
        //for print out the matrix
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print("  " + id[i][j]);
            }
            System.out.println();
        }



    }
}
