package scan;

import java.util.Scanner;

public class InputIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a int number: ");
        int num = sc.nextInt();

        //String s = num +"";
       // String s = Integer.valueOf(num);
        String s = Integer.toString(num);
        System.out.println("the string formet of entered int:  " + s);
    }
}
