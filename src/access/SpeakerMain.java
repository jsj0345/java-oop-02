package access;

public class SpeakerMain {
  public static void main(String[] args) {
    Speaker speaker = new Speaker(90);
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();


    // 필드에 직접 접근
    // System.out.println("volume 필드 직접 접근 수정");
    // speaker.volume = 200; // 이렇게 필드에 직접 접근해서 값을 바꾸면 기존에 100이 최댓값이였는데 더 값이 커져버리니 문제 발생.
    // -> 접근을 못하게 막아야 하는거 아닌가?  어떻게 막을까? volume 필드의 외부 접근을 막을라면 "접근 제어자" 라는 것이 필요함.
    // Speaker 클래스에 있는 volume이라는 멤버 변수에 private라는 제어자를 써서 필드에 접근 불가능하게 막음!
    // speaker.showVolume();

  }
}
