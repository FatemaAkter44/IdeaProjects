package filehandaling;

import java.io.File;

public class GetInfoOfAFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\JavaPractice\\sample1.txt");
        if(f.exists()){
            System.out.println("file nams: "  + f.getName());
            System.out.println("file location(getAbsoulutePath): "+ f.getAbsolutePath());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("readable: "+ f.canRead());
            System.out.println("file size in byte: "+ f.length());
            System.out.println("getPath: " + f.getPath());
        }else{
            System.out.println("file does not exit.Sorry!");
        }


    }
}
