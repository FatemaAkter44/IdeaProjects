package readfile;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {

        String id, name;
        try{
            Formatter formatter = new Formatter("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\formater.txt");
            Scanner input = new Scanner(System.in);
            System.out.print("How many students? ");
            int number = input.nextInt();

            for(int i = 0; i<number;i++){
                System.out.println("please enter the \"id\" and \"Name\" of the student");
                id = input.next();
                name=input.next();
                formatter.format("%s %s\r\n", id, name);
            }

           // formatter.format("%s %s\r\n","1", "Fatema Akter");
           // formatter.format("%s %s\r\n","2", "Ayesha Akter");
           // formatter.format("%s %s\r\n","1", "Amina Akter");

            formatter.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }


    }
}
