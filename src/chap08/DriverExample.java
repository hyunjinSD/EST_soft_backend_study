package chap08;

import chap06.Car;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle bus = new Bus();
        driver.drive(bus);

        Vehicle taxi = new Taxi();
        driver.drive(taxi);
    }
}
