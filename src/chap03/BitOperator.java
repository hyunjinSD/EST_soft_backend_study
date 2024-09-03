package chap03;

public class BitOperator {
    public static void main(String[] args) {
        int x = 15;
        int y = 30;

        System.out.println(x & y);  // 10진수=14 2진수 01110 / 2의 3승 + 2의 2승 + 2의 1승 = 14
        System.out.println(x | y);  // 10진수=31 2진수
        System.out.println(x ^ y);  // 10진수=17
        System.out.println(~x);  // 10진수=-16

        // - 음수값 -> 이진수
        // 양수값 2진수에서(8비트 표현식) 1. 전체 비트 반전 2.+1

        // 비트 쉬프트 연산자
        int value = -8;
        System.out.println(value >> 2);
        System.out.println(value << 2);


    }
}

