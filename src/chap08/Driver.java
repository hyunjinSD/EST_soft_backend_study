package chap08;

import chap06.Car;

public class Driver {
    public void drive(Vehicle vehicle) {
        // instanceof 연산자
        if (vehicle instanceof Bus) {
            System.out.println("Bus//");
        } else if (vehicle instanceof Taxi) {
            System.out.println("Taxi//");
        }
        // switch - case 문
//        switch (vehicle) {
//            case Bus bus -> System.out.println("Bus//");
//            case Taxi taxi -> System.out.println("Taxi/");
//            default -> System.out.println("");
//        }

        vehicle.run();
    }
}
