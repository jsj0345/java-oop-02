package oop1.ex;

public class AccountMain {
  public static void main(String[] args) {
    Account account = new Account(); // 인스턴스 생성

    account.deposit(10000); // 입금 만원
    account.withdraw(9000); // 출금 9천원
    account.withdraw(2000); // 천원 남았으므로 2천원 출금은 못함.

    System.out.println("잔고: "+account.balance); // 잔고 출력

  }

}



