package Assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterWithTryResource {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("file.txt")) {
            Scanner sc = new Scanner(System.in);
            String text = "";
            while (!text.equals("quit")) {
                text = sc.nextLine();
                if (!text.equals("quit"))
                    fw.write(text);
            }
        } catch (IOException e) {
            System.out.println("Exception occurred "+ e.getMessage());
        }
    }
}
