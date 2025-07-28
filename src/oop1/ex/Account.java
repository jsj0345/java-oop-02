package oop1.ex;

public class Account {
  int balance; // 잔액 멤버변수

  int deposit(int amount){ // 입금 메서드
    balance = balance + amount;
    return balance;
  }

  int withdraw(int amount){ // 출금 메서드

    if(balance < amount){
      System.out.println("잔액 부족");
      return balance;
    }
    else{
      balance = balance - amount;
      return balance;
    }

  }


}


/*
public class Account{
  int balance; // 잔액 멤버변수

  int deposit(int amount){ // 입금 메서드
    balance = balance + amount;
    return balance;
  }

  int withdraw(int amount){ // 출금 메서드

    if(balance < amount){
      System.out.println("잔액 부족");
      return balance;
    }
    else{
      balance = balance - amount;
      return balance;
    }

 }

}


 */
