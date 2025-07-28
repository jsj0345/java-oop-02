package access;

public class Speaker {
  private int volume; // private라는 접근 제어자를 쓰면 외부에서는 접근 불가능.
  // private이 붙은 경우 해당 클래스 내부에서만 호출 할 수 있다.

  Speaker(int volume){
    this.volume = volume;
  }

  void volumeUp(){
    if (volume >= 100){
      System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
    } else {
      if(volume>=0 && volume<=90) {
        volume += 10;
      }
      else if(volume>90 && volume<100){
        volume = 100;
      }
      System.out.println("음량을 10 증가합니다.(단 91부터 99까지는 증가 시킬때 100으로 고정)");
    }
  }

  void volumeDown(){
    volume-=10;
    System.out.println("volumeDown 호출");
  }

  void showVolume() {
    System.out.println("현재 음량: "+volume);
  }

}
