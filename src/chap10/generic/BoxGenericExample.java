package chap10.generic;

public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("문자열");
        String str = box.get();
        System.out.println(str);

        // 제네릭 메소드
        Box<String> value = Util.boxing("문자열값");
        Box<Integer> value2 = Util.boxing(12345);
    }
}
