package chap02;

public class StringConverter {
    public static void main(String[] args) {
        // String -> 숫자 변환
        String str = "12345"; // int/Integer
        int primitiveStr = Integer.parseInt(str);
        Integer wrapperStr = Integer.valueOf(str);

        // String -> long/Long
        long primitiveLong = Long.parseLong(str);
        Long wrapperLong = Long.valueOf(str);

        String value = "10000.345";
        float primitiveFloat = Float.parseFloat(value);
        Float wrapperFloat = Float.valueOf(value);

        double primitiveDouble = Double.parseDouble(value);
        Double wrapperDouble = Double.valueOf(value);

        int intValue = 10;  // 10 -> "10"
        String s1 = intValue + "";
        String s2 = Integer.toString(intValue);
        String s3 = String.valueOf(intValue);

        System.out.println(intValue);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
