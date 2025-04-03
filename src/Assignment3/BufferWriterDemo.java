package Assignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            Scanner scanner = new Scanner(System.in);
            String text = "";
            System.out.println("Enter favorite books");
            while (!text.equals("quit")) {
                text = scanner.nextLine();
                if (!text.equals("quit"))
                    bufferedWriter.write(text+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error occurred "+ e.getMessage());
        }
    }
}
