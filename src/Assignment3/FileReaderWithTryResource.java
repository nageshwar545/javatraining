package Assignment3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithTryResource {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("file.txt"); Scanner sc = new Scanner(fileReader);) {
            String line;
            while (sc.hasNext()) {
                line = sc.nextLine();
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
