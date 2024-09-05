package chap05;

public class CompareReferenceType {
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass outter2 = new OutterClass();

        System.out.println(outter == outter2); // false

        String str1 = new String("문자1");
        String str2 = new String("문자1");

        System.out.println(str1 == str2); // false

        String str3 = "문자1";
        System.out.println(str1 == str3); // false

        String str4 = "문자1";
        System.out.println(str3 == str4); // true

        // String끼리 비교할때는 주소값이 아닌 값만을 비교하도록 equals() 사용 권장
    }
}
