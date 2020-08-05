package yourpackage;

import static mypackage.MyScanner.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("put an integer : ");
        int a = scanInt();
        System.out.println("int a = " + a);
    }
}