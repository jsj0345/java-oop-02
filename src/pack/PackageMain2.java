package pack;

// import pack.a.User;
// import pack.a.User2;

import pack.a.*;

public class PackageMain2 {
  public static void main(String[] args) {
    Data data = new Data();

    User user = new User();
    // import를 사용한 덕분에 코드에서는 패키지 명을 생략하고 클래스 이름만 적으면 된다.

    User2 user2 = new User2();
    /*
    위에 import pack.a.User2; 가 있으니 User2형인 인스턴스를 생성했지만
    만약에 pack.a 패키지 하위에 있는 여러 클래스들을 사용해야 한다면?
    import pack.a.*; 를 사용한다.
     */


  }
}






