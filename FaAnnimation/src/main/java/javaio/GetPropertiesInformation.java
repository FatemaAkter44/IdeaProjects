package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesInformation {

    public static void getProperties() throws IOException {
        File filePath = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\FaAnnimation\\src\\main\\resources\\app.properties");
        FileReader fileReader = new FileReader(filePath);

        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));

    }

    public static void main(String[] args) throws IOException {
        getProperties();
    }
}
