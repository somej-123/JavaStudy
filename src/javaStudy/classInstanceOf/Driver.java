package javaStudy.classInstanceOf;

import javaStudy.classInstanceOf.Driver;

public class Driver {
    public void driver(Vehicle vehicle){
        if( vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;

            bus.checkFare();
        }
        vehicle.run();
    }
}
