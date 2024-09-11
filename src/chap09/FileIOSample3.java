package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample3 {
    public static void main(String[] args) {
        FileIOSample3 fileIOSample3 = new FileIOSample3();
        try {
            fileIOSample3.readFile();
        } catch (IOException e) {
            System.out.println("IOException 예외발생시 예외처리");
        }
        // 밑에서 throws로 던졌더니 호출한 쪽에서 오류가 생겼다. 호출측으로 예외 처리를 넘김.
    }// 어디선가 try catch로 예외 처리를 해야한다.
    // 애초에 에러가 생겼던 readFile 메소드에서 예외처리를 해주는게 제일 좋다

    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt")); // 위에 filename을 넣어도 됨
        System.out.println(reader.readLine());
        reader.close();
    }
}
