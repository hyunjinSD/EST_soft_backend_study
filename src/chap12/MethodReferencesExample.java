package chap12;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 호출
        operator = (left, right) -> Calculator.staticMethod(left, right);
        System.out.println(operator.applyAsInt(1,2));

        operator = Calculator::staticMethod;

        // 인스턴스 메소드 호출
        Calculator calculator = new Calculator();
        operator = calculator::method;
        System.out.println(operator.applyAsInt(3,5));
    }
}
