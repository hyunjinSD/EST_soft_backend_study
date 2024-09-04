package chap04;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;
            if(i % 3 == 0){
                System.out.println(i + "는 3의 배수");
            }
        } while (i < 60);
    }
}
