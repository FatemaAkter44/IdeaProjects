package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesExersize {
    public static Properties PropertiesFileReadingExersize() throws IOException {
        File fileLocalWay = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\FaAnnimation\\src\\main\\resources\\Exersize.properties");
        FileReader fileReader = new FileReader(fileLocalWay);

        Properties objectForLoadPropertiesFile = new Properties();
        objectForLoadPropertiesFile.load(fileReader);
        return objectForLoadPropertiesFile;
    }
    public static void cherecter() throws IOException{
        System.out.println(propertiesExersize.PropertiesFileReadingExersize().getProperty("ayesha"));
        System.out.println(propertiesExersize.PropertiesFileReadingExersize().getProperty("mahdi"));
    }

    public static void main(String[] args) throws IOException {
        propertiesExersize.cherecter();
    }

}
