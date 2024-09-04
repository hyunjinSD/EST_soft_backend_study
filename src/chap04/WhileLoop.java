package chap04;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while(i <=5) {
            System.out.println(i);
            i++;
        }

        System.out.println("------------------------");

        int treeHit = 1;
        while(treeHit <=10) {
            System.out.println(" 나무를 " + treeHit + "번 찍었습니다.");
            treeHit++;
        }
        System.out.println("나무 넘어갑니다.");

        System.out.println("-------------------------");

        int a = 1;
        while(a <=60) {
            a++; // 증감식은 continue 앞에 있어야 무한 루프에 빠지지 않음
            if(a % 3 != 0) {
                continue;
            }
            System.out.println(a + "는 3의 배수");
        }

    }
}
