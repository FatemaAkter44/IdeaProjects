package readfile;

import java.io.File;
import java.util.Scanner;

public class ReadFileTxt {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\formater.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNext()){
                String id = sc.next();
                String name= sc.next();
                System.out.println("id "+id+"  name "+name);
            }
            sc.close();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
