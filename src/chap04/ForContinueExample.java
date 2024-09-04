package chap04;

public class ForContinueExample {
    public static void main(String[] args) {
        int[] marks = {90, 25, 67, 45, 80};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 70) {
                continue;
            }
            System.out.println((i + 1) + "번 학생, 축하합니다 합격입니다!");
        }

        System.out.println("----------");

        for (int i = 0; i <=60; i++) {
            int value = i + 1;
            if (value % 3 != 0) {
                continue;
            }
            System.out.println(value + "는 3의 배수입니다.");
        }
        System.out.println("----------");

        for (int i = 0; i <=60; i++) {
            if(i % 3 != 0) {
                continue;
            }
            System.out.println(i + "는 3의 배수입니다.");
        }

        System.out.println("----------");

        for (int i = 1; i <=60; i++) {
            if(i % 3 == 0) {
                System.out.println(i + "는 3의 배수입니다.");
            }
        }
    }
}
