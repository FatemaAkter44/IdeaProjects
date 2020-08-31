package string;

public class Palindrome {
    //liril, bob,

    public static void palindromeOne(){
        String word = "bob";
        char wordChar[] =word.toCharArray();
        int size = wordChar.length;

        char revarceWordChar[] = new char[size];
        int index = 0;
        while ( index != size){
            revarceWordChar[size -1 -index] = wordChar[index];
            ++index;
        }
        while (index != size) {
            if (revarceWordChar[index] != wordChar[index]){
                System.out.println("not a palindrome");
                System.exit(0);
            }
            else{
                ++index;
                continue;
            }
        }
        System.out.println("Palindrome");
    }

    public static void palindromeTwo(){
        String x ="Boc";
        char y[] =x.toCharArray();
        int size = y.length;
        char z[] = new char[size];
        int i = 0;
        while (i!=size){
            z[size-1-i] = y[i];
            ++i;
        }

        System.out.println(y);
        System.out.println(z);

        while ( i != size){
            if (z[i] != y[i]){
                System.out.println("not palindrome");
                System.exit(0);
            }
            else {
                ++i;
                continue;
            }

        }
        System.out.println("palindrome");
    }

    public static void main(String[] args) {
        //palindromeOne();
        palindromeTwo();
    }
}
