package poly.ex.sender;

public class EmailSender implements Sender{
  private String detail;

  @Override
  public void sendMessage(String detail) {
    this.detail = detail;
    System.out.println("메일을 발송합니다: "+this.detail);
  }
}
