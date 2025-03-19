package Assignment1;

public class Employee {
    public long id;
    public String name;
    public int age;
    public float experience;
    public boolean isFullStackDeveloper;


    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
    }
    public Employee(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
    public Employee(long id, String name, int age, float experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Experience: "+ experience);
    }
    public Employee(long id, String name, int age, float experience, boolean isFullStackDeveloper) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.isFullStackDeveloper = isFullStackDeveloper;
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Experience: "+ experience);
        System.out.println("Is Fullstack Developer: "+ (isFullStackDeveloper ? "Yes" : "No"));
    }
}
