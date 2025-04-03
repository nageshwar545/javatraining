package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWithTryResource {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))){
            String text = "";
            System.out.println("Books:");
            while ((text = bufferedReader.readLine()) != null){
                System.out.println(text);
            }
        } catch (IOException e) {
            System.out.println("Error occurred "+e.getMessage());
        }
    }
}
