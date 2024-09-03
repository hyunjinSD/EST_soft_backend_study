package chap03;

public class OperatorTestSample {
    public static void main(String[] args) {

        // 삼항 연산자
        int num = 8;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        //----------------------

        int a = 10;
        int b = 10;
        // 값이 같다면 a 반환
        String result2 = (a >= b) ? "a" : "b";
        System.out.println("result2 = " + result2);

        // -----------------------
        
        int score = 65;
        String result3 = (score >= 60) ? "합격" : "불합격";
        System.out.println("result3 = " + result3);


    }
}
