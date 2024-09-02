package chap02;

public class Question {
    public static void main(String args[]) {
        // 에러가 발생하는 부분을 고쳐보세요.
        int a = 999;
        char b = 'a';
        float c = 1.23F;

        int number1 = 10;
        double number2 = 2.0;

        // 사칙연산 코드 추가

        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        double result4 = number1 / number2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(10 / 2 + 3 * 4);

        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1.equals(str2));
    }
}