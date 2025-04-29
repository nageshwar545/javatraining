package workshop;

import java.io.*;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args)  {
        User user = new User("Nageshwar", "nag@test.com", "Cotiviti", "1223333");

        File file = new File("c:\\files\\user.ser");
        file.getParentFile().mkdir();
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);) {

            User user1 = (User) ois.readObject();
            System.out.println(user1.getName());
            System.out.println(user1.getEmail());
            System.out.println(user1.getCompany());
            System.out.println(user1.getPassword());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
