package static2;

public class DecoData {

  private int instanceValue;
  private static int staticValue;

  public static void staticCall() {
    // instanceValue++; //인스턴스 변수 접근, compile error
    // instanceMethod(); // 인스턴스 메서드 접근, compile error.

    staticValue++; // 정적 변수 접근.
    staticMethod(); // 정적 메서드 접근.

    /*
    static은 메서드 영역에서 공통으로 쓰이는 요소인데 공통 ->개인(인스턴스)로 접근은 불가능하지만
    개인(인스턴스) -> 공통으로의 접근은 가능하다.

    애초에 인스턴스를 생성해야 인스턴스에 있는 변수들에 접근 할 수 있는데(인스턴스가 생성 되면 heap 영역에 생성됨)
    생성 조차 안했으니 알아낼 방법이 없음.
     */
  }

  /*
  public static void staticVall(DecoData data){
  // 원래 static은 인스턴스 변수에 접근 할 수 없지만 이렇게 주소를 받으면 당연히 접근 가능하다. (위치를 아니까)
      data.instanceValue++;
      data.instanceMethod();
  }
   */

  public void instanceCall() {
    instanceValue++; //인스턴스 변수 접근.
    instanceMethod(); //인스턴스 메서드 접근.

    staticValue++; //정적 변수 접근.
    staticMethod(); //정적 메서드 접근.

  }

  private void instanceMethod() {
    System.out.println("instanceValue=" + instanceValue);
  }

  private static void staticMethod() {
    System.out.println("staticValue=" + staticValue);
  }

}

/*
package static2;

public class DecoData {

  private int instanceValue;
  private static int staticValue;

  public static void staticCall() {
    // instanceValue++; // 인스턴스 변수 접근, complile error
    // instanceMethod(); // 인스턴스 메서드 접근, compile error

    staticValue++; // 정적 변수 접근.
    staticMethod(); // 정적 메서드 접근
  }

  public void instanceCall() {
    instanceValue++; // 인스턴스 변수 접근
    instanceMethod(); // 인스턴스 메서드 접근.

    staticValue++;
    staticMethod();
  }

  private void instanceMethod() {
    System.out.println("instanceValue=" + instanceValue);
  }

  private static void staticMethod() {
    System.out.println("staticValue=" + staticValue);
  }
}
 */
