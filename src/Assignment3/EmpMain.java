package Assignment3;

import java.io.*;

public class EmpMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee e = new Employee("Nageshwar", "nag@test.com","Senior Software Engineer", 10, "Cotiviti", 'Y');
        System.out.println(e);


        File f = new File("employee.dat");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee readEmp = (Employee) ois.readObject();
        System.out.println(readEmp);
    }
}
