package datastructure;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public void priourityQueueOne(){
        //create a priority Queue
        PriorityQueue<Integer> num = new PriorityQueue<Integer>();
        //add items
        num.add(10);
        num.add(9);
        num.add(15);
        num.add(5);
        num.add(23);
        System.out.println(num);

        //remove items (Dequeue)
        while (!num.isEmpty()){
            System.out.println(num.remove());
        }

    }

    public void PriorityQueueString(){
        PriorityQueue<String> name = new PriorityQueue<String>();
        name.add("Ashiq");
        name.add("Kya");
        name.add("Abby");
        name.add("Sobuj");
        name.add("Sana");
        name.add("kiron");
        System.out.println(name);

        while (!name.isEmpty()){
            System.out.println(name.remove());
        }
    }

    public static void main(String[] args) {
        PriorityQueuePractice obj = new PriorityQueuePractice();
        //obj.priourityQueueOne();
        obj.PriorityQueueString();
    }
}
