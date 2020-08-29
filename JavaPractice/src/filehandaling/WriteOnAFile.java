package filehandaling;

import java.io.FileWriter; //import the file writer class
import java.io.IOException;

public class WriteOnAFile {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\sample1.txt");
            w.write("Hello!\nMy name is Fatema.\nI have a Dream to become a programer.");
            w.close();
            System.out.println("writing complite");

        }catch(IOException e){
            System.out.println("An error ocured.");
            e.printStackTrace();
        }
    }
}
