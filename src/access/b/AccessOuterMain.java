package access.b;

import access.a.AccessData;

public class AccessOuterMain {
  public static void main(String[] args) {
    AccessData data = new AccessData();
    // public 호출 가능

    data.publicField = 1;
    data.publicMethod();

    // 다른 패키지 default 호출 불가
    // data.defaultField = 2;
    // data.defaultMethod();

    //private 호출 불가
    // data.privateField = 3;
    // data.privateMethod();

    data.innerAccess(); // innerAccess 메서드는 public이라 호출 가능함.
    /*
    innerAccess 메서드 안에 publicMethod, defaultMethod, privateMethod가 있는데
    innerAccess 메서드가 기준이므로 privateMethod는 같은 클래스 내에 있는거니 사용 가능함.
     */
  }
}

/*
package access.b;

import access.a.AccessData;

public class AccessOuterMain {
  public static void main(String[] args){
    AccessData data = new AccessData();
    // public 호출 가능

    data.publicField = 1;
    data.publicMethod();

    // 다른 패키지 default 호출 불가.
    // data.defaultField = 2;
    // data.defaultMethod();

    // private 호출 불가
    // data.privateField = 3;
    // data.privateMethod();

    data.innerAccess(); // innerAccess 메서드는 public이라 호출 가능함.


 */
