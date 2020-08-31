package string;

public class ReversingString {

    public static void reverceOne(){
        String a ="ABCD EFG";
        char b[] = a.toCharArray();
        int size = a.length();

        char c[] = new char[size];
        int i =0;
        while (i != size){
            c[size-1-i] = b[i];
            ++i;
        }

        System.out.println(b);
        System.out.println(c);
    }

    public static void revarceTwo(){
        String name="JUMU";
        char nameJumu[] = name.toCharArray();
        int size = nameJumu.length;

        char copyname[] = new char[size];
        int index = 0;
        while (index!=size){
            copyname[size-1-index]=nameJumu[index];
            ++index;
        }
        System.out.println(nameJumu);
        System.out.println(copyname);
    }

    public static void main(String[] args) {
        reverceOne();
        revarceTwo();
    }

}
