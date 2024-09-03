package chap03;

public class StringAppendSample {
    public static void main(String[] args) {
        String str = "Hello" + 123 +456; // 처음에 문자열이 오면 나머지도 문자열로 파악
        System.out.println(str);

        String str2 = 123 + 456+"Hello"; // 숫자가 먼저오면 숫자로 +
        System.out.println(str2);
    }
}
