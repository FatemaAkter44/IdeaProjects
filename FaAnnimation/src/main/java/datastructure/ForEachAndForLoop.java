package datastructure;

public class ForEachAndForLoop {
    public static void main(String[] args) {

        // public void stringPractice () {
        String[] s = {"Dhaka", "Noakhali", "Chitagong", "Comilla"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        String[] s1 = {"Ayesha", "Mahdi", "Amina", "Aiman", "Mahtab"};
        for (String x : s1) {
            System.out.println(x);
        }
    }
}
