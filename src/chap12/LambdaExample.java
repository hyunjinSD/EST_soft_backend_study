package chap12;

import chap12.custom.MyFuntionalInterface;
import chap12.custom.MyFuntionalInterface2;
import chap12.custom.MyFuntionalInterface3;
import chap12.custom.MyFuntionalInterface4;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다식 : 메소드를 간결하게 표현한 식
        // 자바에서는 람다식을 객체로 취급할 수 있음
        Runnable runnable = () -> System.out.println("익명 구현 객체의 메소드");

        MyFuntionalInterface inter = new MyFuntionalInterface() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        }; // 익명 구현 객체
        inter.run();

        MyFuntionalInterface inter2 = () -> System.out.println("Hello Lambda2");
        inter2.run();

        MyFuntionalInterface2 inter3 = (x) -> System.out.println(x);
        inter3.method(12);

        // 매개변수와 리턴타입이 있는 람다식
        MyFuntionalInterface3 inter4 = (i) ->  i * 2;
        int result = inter4.method(4);
        System.out.println("result: " + result);

        // 매개변수와 리턴타입이 있는 람다식 작성해보기 (매개변수 2개)
        MyFuntionalInterface4 inter5 = (i,j) -> {
            System.out.println("매개변수가 2개인 method");
            return i * j;
        };
        int result2 = inter5.method(3,5);
        System.out.println("result2: " + result2);

        MyFuntionalInterface4 inter6 = (i, j) -> i+j;  // 익명 구현 객체
        int result3 = inter6.method(1,5);
    }

}
