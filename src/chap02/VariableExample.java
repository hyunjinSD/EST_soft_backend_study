package chap02;

public class VariableExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 1000000000;

        long longValue = 100;
        long longValue2 = 10000000000L;

        float floatValue = 1.01234F;
        double doubleValue = 1.1234;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        float floatValue2 = 0.1234567890123456789F;
        double doubleValue2 = 0.1234567890123456789;
        System.out.println(floatValue2);
        System.out.println(doubleValue2);

        boolean stop = true;
        if (stop) {
            System.out.println("시작합니다");
        }else {
            System.out.println("중지합니다");
        }
    }
}
