package chap08.defaultmethod;

public class Zookeeper {
    void feed(Predator predator) {
        predator.printFood();

//        System.out.println("feed meat");
//        System.out.println("feed " + predator.getFood()); // 다형성
    }
}