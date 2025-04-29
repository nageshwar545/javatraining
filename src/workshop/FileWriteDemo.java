package workshop;

import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {

        File file = new File("c:\\files\\notes.txt");
        file.getParentFile().mkdir();
        String test = "Hello this is nageshwar";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader  br =  new BufferedReader(new FileReader(file))) {
            bw.write(test);

            bw.flush();

            int c;
            while((c = br.read()) != - 1){

                System.out.print((char)c);
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
