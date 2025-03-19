package Assignment1;

public class Car {
    private static long insuranceId;
    private int regNo;
    public int mileage;
    public String brand;

    public Car(int mileage, String brand, int regNo, long insuranceId) {
        this.setMileage(mileage);
        this.setBrand(brand);
        this.setRegNo(regNo);
        setInsuranceId(insuranceId);
    }

    public static long getInsuranceId() {
        return  insuranceId;
    }
    public static void setInsuranceId(long insuranceId) {
        Car.insuranceId = insuranceId;
    }
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
