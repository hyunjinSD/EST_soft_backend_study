package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // 파일 내용 읽어오는 코드
        try {
//            String file = System.getProperty("user.dir");
//            String filename = file + "/file1.txt";
//            System.out.println(filename);

//            파일 경로 찾기
//            String path = FileIOSample.class.getResource("").getPath();
//            System.out.println("path: " + path);

            BufferedReader reader = new BufferedReader(new FileReader("file.txt")); // 위에 filename을 넣어도 됨
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("IOException 발생");
            // FileNotFoundException catch문이 없어도 IOException이 FileNotFoundException 에러의 부모 클래스기때문에
            // IOException 발생 출력문이 출력됨. 그러므로 최상위 부모인 Exception으로만 catch해줘도 됨
            // 실무에선 각각의 에러로 예외처리를 잡아내는게 좋음.
        }

    }
}
