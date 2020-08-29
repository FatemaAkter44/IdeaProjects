package filehandaling;

import java.io.File; // to import the file class alt+enter
import java.io.IOException; //import t0 handle the IOExecption class to handle error

public class CreateFile {
    public static void main(String[] args) {
        File createFile1 = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\sample1.txt");
       try{
           if(createFile1.createNewFile()) {
               System.out.println("file created: " + createFile1.getName());
           }else{
               System.out.println("file already exist");
           }
       } catch (IOException e){
           System.out.println("An error occured.");
           e.printStackTrace();

       }
    }
}
