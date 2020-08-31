package string;

public  class CopyStringIntoAnother {
    public static void copyOne(){
        String x = "Ayesha";
        char y[] =x.toCharArray();
        int size = y.length;

        char z[]=new char[size];
        int i = 0;
        while (i !=size){
            z[i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(z);

    }

    public static void copyTwo(){
        String name = "Mahdi";
        char nameCharArray[] = name.toCharArray();
        int size = nameCharArray.length;

        char nameCopyCharArray[] = new char[size];
        int i = 0;

        while (i!=size){
            nameCopyCharArray[i] = nameCharArray[i];
            i++;
        }

        System.out.println(nameCharArray);
        System.out.println(nameCopyCharArray);

    }

    public static void copythree(){
        String a = "I love My Country";
        char b[] =a.toCharArray();
        int size = b.length;

        char c[] = new char[size];
        int i = 0;
        while (i != size){
            b[i] = c[i];  // it will return only empty value, b array are replacing with space of c array
            ++i;
        }
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {
        //copyOne();
        //copyTwo();
        copythree();
    }

}
