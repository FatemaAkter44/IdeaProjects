package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueqePractice {
    public void queqePracticeOne(){
        Queue<Integer> num = new LinkedList<Integer>();
        System.out.println(num);
        ((LinkedList<Integer>) num).add(1);
        System.out.println(num);
        ((LinkedList<Integer>) num).add(10);
        System.out.println(num);
        num.add(30);
        System.out.println(num);
        num.remove();
        System.out.println(num);

    }

    public static void main(String[] args) {
       QueqePractice q = new QueqePractice();
       q.queqePracticeOne();
    }

}
