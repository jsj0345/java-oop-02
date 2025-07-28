package restudy4.static2;

public class DecoMain1 {
  public static void main(String[] args) {
    String s = "hello java";
    DecoUtil1 utils = new DecoUtil1();
    String deco = utils.deco(s);
     /*
     단순히 *를 붙여주는 기능을 하는데 보통 인스턴스에 접근할땐 멤버 변수를 사용하려는 목적이 큰데
     이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공함.
     */

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
  }
}
