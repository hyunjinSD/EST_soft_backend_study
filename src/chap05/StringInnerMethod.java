package chap05;

//문자열 내장 메소드 실습

public class StringInnerMethod {
    public static void main(String[] args) {
        String hello = "Hello Java";

        int index = hello.indexOf("J");  //6
        char character = hello.charAt(index); // j

        hello.charAt(hello.indexOf("J"));
        //indexOf와 charAt는 반대 (문자열과 숫자)

        // replaceAll()
        String hello2 = "Hello Java Java";
        String replaceStr = hello2.replaceAll("Java", "everyone");
        System.out.println(replaceStr);

        // substring()
        String hello3 = "Hello everyone everyone";
        hello3.substring(8, 13);  // eryon
        hello3.substring(8); // 8번부터 끝까지 출력 eryone everyone

        // toUpperCase(), toLowerCase()
        String hello4 = "Hello World!";
        System.out.println(hello4.toUpperCase());
        System.out.println(hello4.toLowerCase());

        // trim()

        System.out.println("         hello4.trim():  " + hello4.trim());

        String str1 = "aaaabbccd";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        System.out.println("----------------");

        String str2 = "Hello Welcome Java";
        String[] result2 = str2.split(" ");
        for (int i = result2.length - 1; i >=0; i--) {
            System.out.print(result2[i] + " ");
        }

        System.out.println("----------------");

        String str3 = "           Hello Welcome Java         ";
        System.out.println(str3.replaceAll(" ", ""));
    }
}
