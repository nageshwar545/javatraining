package Assignment2.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {


        // Create a TreeSet of players
        TreeSet<String> players = new TreeSet<>();

        // Adding
        players.add("Virat");
        players.add("Rohit");
        players.add("Sachin");
        players.add("Dhoni");

        // Displaying
        System.out.println("Players: " + players);

        // Checking
        System.out.println("Is Sachin present? " + players.contains("Sachin"));

        // Removing
        players.remove("Dhoni");
        System.out.println("After removing Dhoni: " + players);

        // Displaying using loop
        for (String player : players) {
            System.out.println(player);
        }
    }
}
