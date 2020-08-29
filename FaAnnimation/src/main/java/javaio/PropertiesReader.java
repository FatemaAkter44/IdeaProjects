package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public Properties fileReadProperties() throws IOException {
        File fileProperties = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\FaAnnimation\\src\\main\\resources\\app.properties");
        FileReader read = new FileReader(fileProperties);

        Properties propertiesFileRead = new Properties();
        propertiesFileRead.load(read);

        return propertiesFileRead;

    }

    public static void nameOne() throws IOException{
        PropertiesReader propertiesReader = new PropertiesReader();
        System.out.println(propertiesReader.fileReadProperties().getProperty("name1"));
        System.out.println(propertiesReader.fileReadProperties().getProperty("name2"));
    }

    public static void main(String[] args) throws IOException {
       nameOne();
    }

}
