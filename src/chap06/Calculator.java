package chap06;

public class Calculator {
    int a;

    Calculator() {
        //Default 생성자
    }

    Calculator(int a){
        this.a = a;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    void postfixOperator() {
        this.a++;
        // a++ 이렇게 써도 됨
    }

    void postfixOperator(Calculator cal) {
        cal.a++;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator cal = new Calculator();
        int result = cal.postfixOperator(a); // (메소드 타입) 변경
        System.out.println(result);


        // 2. Calculator cal 객체를 매개변수로 전달 (이렇게 사용 안함)
        Calculator cal1 = new Calculator(1);
        cal1.postfixOperator(cal1);
        System.out.println(cal1.a);

        // 3. 최종수정 : cal 객체안의 a값을 변경해주는 메소드 호출

        Calculator cal2 = new Calculator(1);
        cal2.postfixOperator();
        System.out.println(cal2.a);
    }
}