package readfileexternal;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public void readFile() throws IOException {
        String path ="C:/Users/Fatema Akter/IdeaProjects/JavaPractice/data.txt";
        FileReader fileReader = new FileReader(path);
        fileReader.read();
    }

}
