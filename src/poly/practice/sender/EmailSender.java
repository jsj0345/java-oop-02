package poly.practice.sender;

public class EmailSender implements Sender {
  @Override
  public void sendMessage(String detail){
    System.out.println("메일을 발송합니다: "+detail);
  }
}
