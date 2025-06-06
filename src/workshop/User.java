package workshop;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String email;
    private  String company;
    private  String password;

    public User(String name, String email, String company, String password){
        setName(name);
        setEmail(email);
        setCompany(company);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
