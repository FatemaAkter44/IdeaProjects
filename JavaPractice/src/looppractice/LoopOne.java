package looppractice;
import java.util.Scanner;
public class LoopOne {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String x=sc.next();
                int y=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", x, y);

            }
           // int a =sc.nextInt();
           // int b = sc.nextInt();
            //System.out.println("================================");
           // System.out.println(s1);
           // System.out.println(x);
            /*System.out.printf("%5d%n",12);
            System.out.printf("%5d%n",123);
            System.out.printf("%5d%n",1234);
            System.out.printf("%5d%n", 12345);
            System.out.printf("%5d%n",123456);
            System.out.printf("%-5d%n",12);
            System.out.printf("%5d%5d%n",1, 2);
            System.out.printf("%50f%n",22.2222);
            System.out.printf("%-8d%n", 123);
            System.out.printf("%-6s%5d%n", "num=", 456);
*/
        }
    }


