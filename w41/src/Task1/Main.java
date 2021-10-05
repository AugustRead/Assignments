package Task1;

public class Main {

    public static void main (String[] args){
        Driver driver = new Driver("August", 23);

        Car car = new Car("Volvo", "XC90", 2022, "SUV");
        Car car2 = new Car("Tesla", "Model 3", 2022, "Sedan");

        car.setDriver(driver);
        car2.setDriver(driver);

        System.out.println(car.toString());
        System.out.println(driver.toString());

        //Car 2
        System.out.println("");
        System.out.println(car2.toString());
        System.out.println(driver.toString());

    }

}
