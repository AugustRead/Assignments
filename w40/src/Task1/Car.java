package Task1;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;


    public Car(String brand, String model, int year, String bodyStyle) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}