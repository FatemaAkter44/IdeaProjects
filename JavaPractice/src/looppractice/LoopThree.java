//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
package looppractice;
import java.util.*;
import java.io.*;
public class LoopThree {
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
                a=a+((int)Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }

}
