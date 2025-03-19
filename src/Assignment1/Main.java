package Assignment1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        System.out.println("----------------");
        new Employee(11322, "Gibbs");
        new Employee(11324, "John", 29);
        new Employee(11323, "Nick", 29, 10);
        new Employee(11325, "Test", 29, 10, true);
        new FetchDetails();
    }
}
