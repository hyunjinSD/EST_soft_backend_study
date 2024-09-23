package chap12.custom;

import java.util.function.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "str";
        String getStr = supplier.get();
        System.out.println(getStr);

        IntSupplier supplier2 = () -> 123;
        int getInt = supplier2.getAsInt();
        System.out.println(getInt);

        // Consumer
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Consumer 사용해서 입력값 출력하기");

        // Function 구현 객체를 람다식으로 작성하고 호출
        Function<Integer, String> function = x -> String.valueOf(x) + "문자열";
        System.out.println(function.apply(345));

        Function<String, Double> function2 = x -> Double.valueOf(x) * 1.2;
        Double resultFunction = function2.apply("56.7");
        System.out.println("String to Double: " + resultFunction);

        // Predicate 구현 객체를 람다식으로 작성
        Predicate<String> predicate = (x) -> x.length() == 0;
        System.out.println("빈값 체크: " + predicate.test(""));
        System.out.println("빈값 체크: " + predicate.test("12433"));
        Predicate<Integer> predicate2 = x -> x % 2 == 0;
        System.out.println("짝수 체크: " + predicate2.test(19));

    }
}
