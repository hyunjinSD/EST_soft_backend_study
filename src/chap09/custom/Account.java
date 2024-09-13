package chap09.custom;

// 은행계좌 클래스

public class Account {
    long balance;

    Account(long balance) {
        this.balance = balance;
    }

    void deposit(long money) {
        this.balance += money;
    }

    void withdraw(long money) throws BalanceInsufficientException{
        if(balance < money) { // 출금 불가
            throw new BalanceInsufficientException("잔액이 부족합니다. 남은금액: " + balance);
            // throw는 예외를 발생시킴  throws는 메소드 뒤에 붙히고 그 뒤에는 던지고 싶은 예외를 붙혀서 던짐
        }
        balance -= money;
    }
    void depositRollback(long money) {
        this.balance -= money;
    }
}
