package Assignment2.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Students");
        System.out.println("--------");
        Student s1 = new Student("John", 22);
        System.out.println("Name:"+ s1.getName() +" Age:"+s1.getAge());
        Student s2 = new Student("Gibbs", 33);
        System.out.println("Name:"+ s2.getName() +" Age:"+s2.getAge());

        // Inheritance
        Animal dog = new Dog();
        dog.sound();

        //Polymorphism
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.add(1,2,3);

        // Abstraction
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        // Encapsulation
        BankAccount account1 = new BankAccount(1221212,0);
        BankAccount account2 = new BankAccount(21212113,0);
        account1.setBalance(4444);
        account2.setBalance(9999);
        System.out.println("Account1 Details");
        System.out.println("Account Number:"+ account1.getAccountNumber() +" Balance:"+account1.getBalance());
        System.out.println("Account2 Details");
        System.out.println("Account Number:"+ account2.getAccountNumber() +" Balance:"+account2.getBalance());
    }
}
