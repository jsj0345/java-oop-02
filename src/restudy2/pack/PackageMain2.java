package restudy2.pack;

import restudy2.pack.a.User;

// 모든 클래스를 사용하고 싶으면 import restudy2.pack.a.*;

public class PackageMain2 {

  public static void main(String[] args) {
    Data data = new Data();
    User user =  new User();
    // import 사용으로 패키지 명 생략 가능.

    /*
    restudy2.pack.a.User user = new restudy2.pack.a.User();
    위처럼 패키지가 다르면 패키지의 전체 경로를 항상 적는데에는 무리가 있다.
    이럴때 import를 사용한다.
     */

  }
}
