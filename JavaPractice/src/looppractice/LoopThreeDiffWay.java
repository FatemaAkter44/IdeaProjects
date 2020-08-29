package looppractice;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class LoopThreeDiffWay {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter value for total queary: ");
        int t=in.nextInt(); // t is for total queary
        for(int i=0;i<t;i++){
            System.out.println("Please enter value for a: ");
            int a = in.nextInt();
            System.out.println("Please enter value for b: ");
            int b = in.nextInt();
            System.out.println("Please enter value for n: ");
            int n = in.nextInt();

            for(int j =0; j<n; j++){
               // a=a+((int)Math.pow(2,j)*b);
                //System.out.print(a+" ");
                a=a+b;
                if(j>0){
                    System.out.print(" ");
                }
                System.out.println(a);
                b=b*2;
            }
            System.out.println();
        }
        in.close();
    }
}
