package javainputoutput;

import java.io.FileReader;
import java.io.IOException;

public class File {
    public void in() throws IOException {
        String path = "C:\\Users\\mushi\\OneDrive\\Desktop\\module02test\\src\\main\\resources\\Key-To-Success";
        FileReader filepath = new FileReader(path);
        int i;
        while ((i = filepath.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
