
import java.util.Scanner;
public class EndOfLife {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int line=1;
        while (sc.hasNext()){
            System.out.println(line + " " + sc.nextLine());
            line++;
        }
        sc.close();

    }
}
