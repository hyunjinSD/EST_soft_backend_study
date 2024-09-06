package chap06;

public class DefaultConstructor {
    String field;

    DefaultConstructor(String field) {
        this.field = field;
    }
    DefaultConstructor() {  // c2 초기화
        field = "특정값으로 초기화";

    }

    public static void main(String[] args) {
// 입력값이 있는 생성자
        DefaultConstructor constructor = new DefaultConstructor("특정값");
// 입력값이 없는 생성자
        DefaultConstructor c2 = new DefaultConstructor();
    }
}
