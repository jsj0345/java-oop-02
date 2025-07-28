package restudy3.access;

public class SpeakerMain {
  public static void main(String[] args) {
    Speaker speaker = new Speaker(90);

    // 앞에서 배운 패키지에 따르면 같은 패키지내에서는 패키지를 상세하게 적을 필요가 없음.
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();

    //필드에 직접 접근.
    System.out.println("volume 필드 직접 접근 수정");
    // speaker.volume = 200; private 접근 오류.
    speaker.showVolume();

    /*
    volume의 값을 100 넘지 못하게 하기 위한 것이 이 코드의 메인인데..
    필드에 직접 접근하여 100을 넘게 해서 문제가 발생했다.
     */

    /*
    좋은 프로그램은 무한한 자유도가 주어진 프로그램이 아니라 적절한 제약을 제공하는 프로그램임.
     */
  }
}
