package chap02;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        long startTimeMs = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");

        long startTimeMs2 = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 = sum2 + 1;
        }
        System.out.println("실행 시간 " + (System.currentTimeMillis() - startTimeMs2) + "ms");
    }
}
