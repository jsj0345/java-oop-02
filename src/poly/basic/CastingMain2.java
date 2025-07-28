package poly.basic;

public class CastingMain2 {

  public static void main(String[] args) {
    //부모 변수가 자식 인스턴스 참조(다형적 참조)
    Parent poly = new Child(); // x001
    //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
    //poly.childMethod();

    /*
    //다운캐스팅(부모 타입 -> 자식 타입)
    Child child = (Child) poly; // x001
    child.childMethod();
    */


    //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
    ((Child) poly).childMethod();

    /*
    ((Child) poly).childMethod();를 실행하면  Parent 타입을 임시로 Child로 변경
    캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것은 아님.
    해당 참조값을 꺼내고 참조값이 Child 타입이 되는 것이다.
    따라서 poly의 타입은 Parent로 그대로 유지 된다.
    이렇게 일시적 다운 캐스팅을 사용하면 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용할 수 있다.
     */

    // 만약에 (Child) poly.childMethod(); 로 하면 poly.childMethod()가 우선 순위여서 에러 발생.
    // ((Child) poly).childMethod();로 작성하면 ()부터 우선 순위여서 ((Child) poly) 부터 연산.

  }
}