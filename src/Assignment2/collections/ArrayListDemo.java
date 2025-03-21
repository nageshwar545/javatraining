package Assignment2.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Declaration
        ArrayList<String> skills = new ArrayList<String>();

        // Adding
        skills.add("Java");
        skills.add("Python");
        skills.add("Angular");

        // inserting based on the index
        skills.add(1, "Sql");

        // changing
        skills.set(3, "Angular and React");

        // reading by index
        System.out.println("Top skill "+skills.get(3));

        // removing
        skills.remove(2);

        // size

        System.out.println("Total skills "+skills.size());
        // displaying
        for (String skill : skills) {
            System.out.println(skill);
        }

        // using iterator
        Iterator<String> it = skills.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear
        skills.clear();



    }
}
