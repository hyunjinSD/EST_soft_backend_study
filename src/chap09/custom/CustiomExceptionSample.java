package chap09.custom;

public class CustiomExceptionSample {

    void method() throws BalanceInsufficientException{
        // 예외 수동으로 발생시키기
        throw new BalanceInsufficientException("잔고 부족 에러 메시지");

    }
}
