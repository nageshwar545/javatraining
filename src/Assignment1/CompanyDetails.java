package Assignment1;

public class CompanyDetails {
    public String companyName;
    public String country;
    public String[] models;

    public CompanyDetails(String companyName, String country, String... models) {
        this.companyName = companyName;
        this.country = country;
        this.models = models;
        this.showCompanyDetails();
    }
    public void showCompanyDetails() {
        System.out.println("Company Name"+ this.companyName);
        System.out.println("Country"+ this.country);
        System.out.print("Model(s) ");
        for(String model: this.models) {
            System.out.print(model+" ");
        }
    }
}
