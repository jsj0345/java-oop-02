package poly.practice.sender;

public class SmsSender implements Sender{
  @Override
  public void sendMessage(String detail) {
    System.out.println("SMS를 발송합니다: "+detail);
  }
}
