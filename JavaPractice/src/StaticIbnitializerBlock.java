import java.util.Scanner;

public class StaticIbnitializerBlock {

    static int B;
    static int H;
    static boolean flag = true;
    static{
        Scanner sc = new Scanner(System.in);
        B =sc.nextInt();
        H =sc.nextInt();
        sc.close();
        if(B<=0 || H<=0){
            flag=false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
        }
    }


    public static void main(String[] args) {
       if(flag){
         int area=B*H;
           System.out.println(area);
       }
    }
}
