package chap09.custom;

//송금 트랜잭션

public class BankTransaction {
    public static void main(String[] args) {
        // A, B 계좌 생성 (상태 필드 추가)
        Account accountA = new Account(30000);
        Account accountB = new Account(0);

        // A -> B 10만원 송금
        // 만약 잔액보다 송금 금액이 크다면 트랜잭션 처리
        int money = 100000;
        try {
            accountA.withdraw(money);   // 입금
            accountB.deposit(money);    // 출금
        } catch (BalanceInsufficientException e) {
            // A계좌 출금 실패했을 때, B계좌에 입금된 금액 차감 (롤백)
            accountB.depositRollback(money);
            System.out.println("송금 실패");
        }
        System.out.println("송금 성공");
    }
}
