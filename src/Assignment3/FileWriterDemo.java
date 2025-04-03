package Assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your skills and enter quit to exit");
            String data = "";
            while (!data.equals("quit")) {
                data =  scanner.nextLine();
                if (!data.equals("quit"))
                    fw.write(data+"\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
