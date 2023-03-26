package javaStudy.argumentInterface;

public class DriverEx {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 해당 부분이 bus, taxi로 대처된다.
        // driver.driver(Vehicle vehicle){
        // vehicle run();
        // }

        driver.driver(bus);
        driver.driver(taxi);
        
    }
}
