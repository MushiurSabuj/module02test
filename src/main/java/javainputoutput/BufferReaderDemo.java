package javainputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        BufferedReader bufferedReader= null;
        String line;

        System.out.println("Please enter the file name to be read.");

        try{
            bufferedReader= new BufferedReader(new FileReader("C:\\Users\\mushi\\OneDrive\\Desktop\\module02test\\src\\main\\resources\\" + scanner.next()));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + "File not found");
            System.exit(0);
            e.printStackTrace();
        }
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException ioex) {
            System.out.println(ioex.getMessage() + "Enter the error message");
        }finally {
            System.exit(0);
        }
    }

}
    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     *
     * */

