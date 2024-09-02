package chap02;

public class Sample {
    public static void main(String[] args) {
//        String , 참조 자료형 : new 예약어를 사용해서 변수를 초기화
//        String 예외
        String str = "실제값";
        String str2 = new String("실제값"); // 이렇게 안씀

        String str3 = ""; // 초기 값 셋팅, 값이 정해지지 않았을때, null은 지향.
        String str4 = "실제값";
        String str5 = new String("실제값");

        System.out.println(str == str2); //false
        System.out.println(str.equals(str2)); //true
        System.out.println(str == str4); //true
        System.out.println(str2 == str5); //false

        int a = 10;
        int b = 10;
        System.out.println(a == b); //true
    }
}
