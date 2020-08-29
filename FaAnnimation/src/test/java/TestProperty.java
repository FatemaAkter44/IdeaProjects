import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestProperty {
    Properties property;
    FileInputStream fs;
    @Test
    public void testProperty() throws IOException {
        fs = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
        property = new Properties();
        property.load(fs);
        System.out.println(property.getProperty("name"));
        System.out.println(property.getProperty("url"));

    }
}
