package chap05;

// 문자열 포맷 (%s 숫자, %d 문자, %f 소수)

public class StringFormat {
    public static void main(String[] args) {
        String str = ".......%s...특정문자%s사이값";
        System.out.println(String.format(str,"치환값1", "치환값2"));

        System.out.println(String.format(str, 4, 5));

        String str2 = "치환값1: %d.....치환값2: %d";
        System.out.println(String.format(str2, 7, 8));

        String str3 = "치환값1: %f .... 치환값2: %f";
        System.out.println(String.format(str3, 4.5,6.7 ));
    }
}
