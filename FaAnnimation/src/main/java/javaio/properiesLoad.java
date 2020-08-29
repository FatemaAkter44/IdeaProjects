package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properiesLoad {
    public static Properties propertiesLoad() throws IOException {
        File file = new File("C:\\Users\\Fatema Akter\\IdeaProjects\\FaAnnimation\\src\\main\\resources\\Exersize.properties");
        FileReader read = new FileReader(file);

        Properties properties = new Properties();
        properties.load(read);
        return properties;


    }

    public static void main(String[] args) throws IOException {
        System.out.println(propertiesLoad().getProperty("ayesha"));
    }
}
