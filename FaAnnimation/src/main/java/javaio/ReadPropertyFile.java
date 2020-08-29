package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public Properties readPropertiesFromProperties() throws IOException {
        File file = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\FaAnnimation\\src\\main\\resources\\app.properties");
        FileReader fileReader = new FileReader(file);

        Properties appProperty = new Properties(); //need an object to hendle propertise inside properties file
        appProperty.load(fileReader); //load properties in the system from the properties file
        return appProperty;
    }

    public static void login() throws IOException {
        ReadPropertyFile readPropertyFile = new ReadPropertyFile();
        System.out.println(readPropertyFile.readPropertiesFromProperties().getProperty("password"));

    }

    public static void main(String[] args) throws IOException {
        login();
    }


}
