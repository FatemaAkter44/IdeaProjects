package scan;
//import java.util.Scanner;
import java.util.*;

public class inputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int    i = sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine(); // this line is to clear keyboard buffer
        String s = sc.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
