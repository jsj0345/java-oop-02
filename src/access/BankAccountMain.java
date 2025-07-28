package access;

public class BankAccountMain {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(10000);
    account.withdraw(3000);
    System.out.println("balance = "+account.getBalance());

    /*
    만약에 BankAccount 클래스에서  isAmountValid 메서드를 public 접근 제어자로 쓴다면 어떻게 될까?

    개발자 입장에서는 public 메서드니까 먼저 검증을 해야 하는지 궁금해서 isAmountValid 메서드를 쓸 수도 있다.

    BankAccount 클래스 내부에서 작동만 잘하면 되는 isAmountValid 메서드 같은 경우에는 굳이 외부에 노출 시킬 이유가 없다.

    오히려 노출시켜서 사용자나 개발자가 더 복잡하게 생각할 수 있음.

     */
  }
}
