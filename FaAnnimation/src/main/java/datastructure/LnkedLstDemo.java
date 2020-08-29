package datastructure;

import java.util.LinkedList;

public class LnkedLstDemo {
    public void LinkedListOne(){
        LinkedList<String> a = new LinkedList<String>();
        a.add("Bangladesh");
        a.add("nepal");
        a.add("India");
        a.add(3, "Pakistan");
        a.addFirst("USA");
        a.addLast("canada");
        a.remove("India");
        System.out.println(a);

        for(String cName : a){
            System.out.println(cName);
        }
        System.out.println(a.size());
        System.out.println(a.getFirst());
        a.clear();
        System.out.println(a);

    }

    public static void main(String[] args) {
        LnkedLstDemo obj = new LnkedLstDemo();
        obj.LinkedListOne();
    }
}