
package java_class15;
import java.util.Scanner;

public class AneDimArray{

    public void arrayOne(){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        System.out.println("Please enter the number: ");

        for(int i = 0; i< x.length; i++){
            x[i]=sc.nextInt();
            //System.out.println("Please enter the number: " + ());
        }
        System.out.println("index 0 value: " + x[0]);

        int sum = 0;
        for (int i =0; i<x.length; i++){
            sum = sum +x[i];
        }
        System.out.println("Sum : " + sum);
        System.out.println("average of array one: " + (sum/x.length));

    }

    public AneDimArray(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AneDimArray p = new AneDimArray();

        p.arrayOne();
    }
}
