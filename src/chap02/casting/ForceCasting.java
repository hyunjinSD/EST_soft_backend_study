package chap02.casting;

import java.sql.SQLOutput;

public class ForceCasting {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String stringValue = "A";

        // int -> double
        double doubleValue2 = intValue;

        // string -> char (캐스팅으로 변환은 x)
//        char var = (char)stringValue;

        // charAt(index) 라는 메소드를 사용해야함.
        char changedValue = stringValue.charAt(0);
    }
}