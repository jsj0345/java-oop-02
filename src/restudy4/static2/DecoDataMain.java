package restudy4.static2;

import static restudy4.static2.DecoData.*;

/*
정적 메서드를 사용할 때 정적 메서드를 자주 호출해야 한다면
위처럼 import static을 활용해보자.
 */

public class DecoDataMain {

  public static void main(String[] args) {
    System.out.println("1.정적 호출");
    staticCall();

    System.out.println("2.인스턴스 호출1");
    DecoData data1 = new DecoData();
    data1.instanceCall();

    System.out.println("3.인스턴스 호출2");
    DecoData data2 = new DecoData();
    data2.instanceCall();

    // 추가
    // 인스턴스를 통한 접근
    DecoData data3 = new DecoData();
    staticCall();

    // 클래스를 통한 접근
    staticCall();
  }
}
