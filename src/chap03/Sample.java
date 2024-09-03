package chap03;

public class Sample {
    public static void main(String[] args) {
        // 단항연산자 - 증감 전/후위 연산자
        int x = 14;
        int result = --x;
        System.out.println(result);
        System.out.println(--x);

        System.out.println("========================");

        int x2= 40;
        double y2 = 50.34;

        int intResult = (int) (x2 + y2);
        double doubleResult = x2 + y2;
    }
}
