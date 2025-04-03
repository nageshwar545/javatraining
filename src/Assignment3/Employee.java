package Assignment3;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String email;
    private String designation;
    private int yearsOfExperience;
    private static  String companyName;
    private transient char isActive  = 'Y';

    public Employee(String name, String email, String designation, int yearsOfExperience, String companyName, char isActive) {
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.yearsOfExperience = yearsOfExperience;
        setCompanyName(companyName);
        setIsActive(isActive);
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +"\n Email: "+this.email+"\n Designation: "+this.designation+"\n Experience: "+this.yearsOfExperience+"\n Company: "+companyName+"\n Is Active: "+this.isActive;
    }
}
