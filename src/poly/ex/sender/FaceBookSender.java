package poly.ex.sender;

public class FaceBookSender implements Sender{
  private String detail;

  @Override
  public void sendMessage(String detail) {
    this.detail = detail;
    System.out.println("페이스북에 발송합니다: "+detail);
  }
}
