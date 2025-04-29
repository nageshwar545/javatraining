package Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", "Associate", "john@cotiviti.com", "Hyderabad"),
                new Employee("Wills", "Manager", "wills@cotiviti.com", "Bangalore"),
                new Employee("Gibbs", "Manager", "gibbs@cotiviti.com", "Bangalore"),
                new Employee("Rome", "Associate", "rome@cotiviti.com", "Bangalore"),
                new Employee("Roy", "Associate", "roy@cotiviti.com", "Hyderabad"),
                new Employee("Krishan", "Associate", "krishan@cotiviti.com", "Hyderabad"),
                new Employee("Rush", "Manager", "rush@cotiviti.com", "Hyderabad"),
                new Employee("Kishan", "Manager", "krish@cotiviti.com", "Hyderabad"),
                new Employee("Krishna", "Manager", "nag@cotiviti.com", "Hyderabad"),
                new Employee("Shiva", "Manager", "shiva@cotiviti.com", "Bangalore"),
                new Employee("Russel", "Manager", "russel@cotiviti.com", "Bangalore"),
                new Employee("Warren", "Manager", "warren@cotiviti.com", "Hyderabad"),
                new Employee("Buffet", "Manager", "buffet@cotiviti.com", "Hyderabad"),
                new Employee("Turkey", "Associate", "turkey@cotiviti.com", "Hyderabad"),
                new Employee("Daniel", "Associate", "daniel@cotiviti.com", "Hyderabad"),
                new Employee("Lucky", "Associate", "lucky@cotiviti.com", "Hyderabad"));
        Predicate<Employee> getHydManagers = emp -> emp.getDesignation().equals("Manager") && emp.getLocation().equals("Hyderabad");
        List<Employee> hydManagers = employeeList.stream().filter(getHydManagers).collect(Collectors.toList());
        System.out.println("Hyderabad Managers "+ hydManagers);
    }
}
