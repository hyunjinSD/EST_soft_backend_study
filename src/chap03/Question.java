package chap03;

public class Question {
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        int number = 10;

        int result1 = number + 1;
        int result2 = number++;
        int result3 = number;
        int result4 = --number;

        System.out.println(result1); // 11
        System.out.println(result2); // 10
        System.out.println(result3); // 11
        System.out.println(result4); // 10

        //--------------------------

        // 아래 코드의 출력값은 무엇일까요?
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5)); //false
        System.out.println((num1 > 5) || (num2 > 5)); // true
        System.out.println(!((num1 > 5) && (num2 > 5))); // true

        //-------------------------

        int i = 6;
        boolean result = (i % 2 ==0) || (i % 3 ==0);
        System.out.println("result = " + result);
        
        // ------------------------

        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1.equals(str2));
    }
}