package poly.ex.sender;

public class SmsSender implements Sender{
  private String detail;

  @Override
  public void sendMessage(String detail) {
    this.detail = detail;
    System.out.println("SMS를 발송합니다: "+this.detail);
  }
}
