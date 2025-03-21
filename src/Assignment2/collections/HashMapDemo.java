package Assignment2.collections;

import Assignment2.oop.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Declaration
        HashMap<Integer, String> students= new HashMap<Integer, String>();

        // adding
        students.put(100, "John");
        students.put(101, "Sachin");
        students.put(102, "Ram");

        // reading the keys
        System.out.println("Keys "+students.keySet());

        // reading the values
        System.out.println("Values "+students.values());

        // reading the keys and values
        System.out.println("Entry set "+students.entrySet());

        // update
        students.put(100, "Dev");

        // get by index
        System.out.println(students.get(100));

        // remove by index
        students.remove(100);

        // using for
        for(int key: students.keySet()) {
            System.out.println("Id:"+key +" Name:"+students.get(key));
        }

        Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Id:"+entry.getKey() +" Name:"+entry.getValue());
        }


        // clear the map
        students.clear();


    }
}
