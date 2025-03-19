package Assignment1;

public class FetchDetails {
    public FetchDetails() {
        Car car = new Car(25, "Tesla", 121212, 2222333);
        System.out.println("Car Details");
        System.out.println("-----------");
        System.out.println("Reg No"+ car.getRegNo());
        System.out.println("Brand"+ car.getBrand());
        System.out.println("Insurance Id:"+ Car.getInsuranceId());

        System.out.println("Company Details");
        System.out.println("---------------");
        new CompanyDetails("Tesla", "India", "test1", "test3");
    }
}
