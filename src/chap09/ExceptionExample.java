package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws IOException {
        int b = Integer.parseInt(args[0]);
        int result = 10/0; // 예외 발생 가능성이 있는 코드(예외처리해야함)
        // ArithmeticException , UncheckedException  예외처리를 강제화 X

        // 존재하지 않는 파일에 데이터 읽어오는 코드 (예외 상황 가정해서 예외 처리를 해라 - 강제화)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("파일명"));
            reader.readLine();
            reader.close();
            // CheckedException(컴파일러가 알려줌) , 명시적으로 예외 처리를 강제화
        } catch (FileNotFoundException e) {
            // 예외 발생 처리 코드
        } catch (IOException e) {
            // IOException 예외가 발생했을 때 처리 코드
        }

    }
}
