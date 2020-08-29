package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAndForEatch {


       public void stringPractice () {
            String[] s = {"Dhaka", "Noakhali", "Chitagong", "Comilla"};
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
            String[] s1 = {"Ayesha", "Mahdi", "Amina", "Aiman", "Mahtab"};
            for (String x : s1) {
                System.out.println(x);
            }
       }


    public void stringForEach() {  // for eatch loop not working with array showing error with args
        String[] s1 = {"Ayesha", "Mahdi", "Amina", "Aiman", "Mahtab"};
        for (String x : s1) {
            System.out.println(x);
        }
    }
    public void arrayListOne(){
        ArrayList<String> name = new ArrayList<String>();
        System.out.println("the size of arraylist in beginning : "+ name.size());
//adding value one by one
        name.add("Love");
        name.add("Hate");
        name.add("Life");
        //System.out.println(name);
       // System.out.println();
       // System.out.println();
        for(String x: name){
            System.out.println("See the difference between normal print and for each: " + x);
        }

        System.out.println();
        System.out.println();

        //using Iterator
        Iterator ite = name.iterator();
        while (ite.hasNext()){
            System.out.println("Print using Iterator: " + ite.next());
        }
        System.out.println(" after adding 3 name: "+name.size());



    }

    public void ArrayListInteger(){
        ArrayList<Integer> num =new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(20);

       // System.out.println("normal print: "+ num);

        for(int i=1; i<num.size(); i++){ //for loop not working with ArrayList
            System.out.println(num.get(i));
        }

        for(int y: num){
            System.out.println("print with for each println : "+y);
        }

        for(int y: num) System.out.print(" " + y);

        System.out.println();

          Iterator it =num.iterator();
        while(it.hasNext()) System.out.println("using Iterator : " + it.next());
    }
    public void ArrayListRemove(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(" the value of index 2: "+num.get(2));
        System.out.println("size of array list: "+ num.size());

        num.remove(2);
        System.out.println("after removing index 2, the result is : "+ num);
        System.out.println("after removing the index 2, current size: "+ num.size());

    }

    public void ArrayListSomeMethods(){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(10);
        number.add(100);
        System.out.println(number);
        boolean check = number.contains(100);
        System.out.println("Before contains method:  " +check);

        number.clear();
        System.out.println("after clear: "+ number);

        int ch = number.indexOf(10);
        System.out.println("That is the index for value 100?   " +ch);

        number.set(2,20); //replace the index 2 value
        System.out.println(number);

    }
    public void arrayLists(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);

        b.add(40);
        b.add(50);
        b.add(60);

        c.addAll(a); //will add all the value of array a into c
        System.out.println(c);
        boolean d = a.equals(c);
        System.out.println(d);

    }

    public void sortingArrayList(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(60);
        a.add(66);
        a.add(55);
        a.add(5);
        System.out.println("befor sort: "+ a);
        Collections.sort(a);
        System.out.println("ascending sort: "+a);

        Collections.sort(a, Collections.reverseOrder());
        //Collections.reverseOrder(a);
        System.out.println("descending: "+a);

    }




    public static void main(String[] args){
        ArrayListAndForEatch obj1 = new ArrayListAndForEatch();
        //obj1.stringPractice();
        // obj1.stringForEach();
        //obj1.arrayListOne();
        //obj1.ArrayListInteger();
        //obj1.ArrayListRemove();
        //obj1.ArrayListSomeMethods();
        //obj1.arrayLists();
        obj1.sortingArrayList();

    }
}
