package filehandaling;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class readafile {
    public static void main(String[] args) {
        try{
            File r = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\sample1.txt");
            Scanner sc = new Scanner(r);
            while(sc.hasNext()){
                String data = sc.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println("an error occure.");
            e.printStackTrace();

        }
    }
}
