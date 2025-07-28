package pack;

import pack.a.User;

public class PackageMain3 {
  public static void main(String[] args) {

    User userA = new User();
    pack.b.User userB = new pack.b.User();

    /*

    pack 패키지에 하위 패키지로 a와 b가 있다.
    a와 b 하위 클래스에 User가 있다. 서로 이름이 같음.
    이럴때 import pack.a.User;를 써서 User userA = new User(); (여기서 User는 당연히 a패키지 하위 클래스)
    위와 같이 생성했으면 import pack.b.User;를 쓴 다음에 User userB = new User(); 는 불가능하다.
    클래스 명이 같아서 구분 하려면 패키지 전체 경로를 써줘야 한다.

    이렇게 클래스 명이 겹치는 경우에는 자주 쓰는걸 import하고 자주 안쓰는걸 패키지 전체 경로 명을 써준다.

     */

  }
}


