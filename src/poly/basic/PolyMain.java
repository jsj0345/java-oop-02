package poly.basic;

public class PolyMain {
  public static void main(String[] args) {
    // 부모 변수가 부모 인스턴스 참조
    System.out.println("Parent -> Parent");
    Parent parent = new Parent();
    parent.parentMethod();

    //자식 변수가 자식 인스턴스 참조
    System.out.println("Child -> Child");
    Child child = new Child();
    child.parentMethod();
    child.childMethod();

    //부모 변수가 자식 인스턴스 참조(다형적 참조)
    System.out.println("Parent -> Child");
    Parent poly = new Child();
    poly.parentMethod();

    // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

    // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생 (자식을 알 수 없다.)
    // poly.childMethod();

  }
}

/*
package poly.basic;

public class PolyMain {
  public static void main(String[] args) {
  // 부모 변수가 부모 인스턴스 참조
  System.out.println("Parent -> Parent");
  Parent parent = new Parent();
  parent.parentMethod();

  // 자식 변수가 자식 인스턴스 참조
  System.out.println("Child -> Child");
  Child child = new Child();
  child.parentMethod();
  child.childMethod();

  // 부모 변수가 자식 인스턴스 참조(다형적 참조)
  System.out.pritnln("Parent -> Child");
  Parent poly = new Child();
  poly.parentMethod();

  다형적 참조

  지금까지 학습한 내용을 떠올려보면 항상 같은 타입에 참조를 대입했다.
  그래서 보통 한 가지 형태만 참조 했었다.

  그런데 Parent 타입의 변수는 다음과 같이 자신인 Parent는 물론이고, 자식 타입까지 참조할 수 있다.
  만약 손자가 있다면 손자도 그 하위 타입도 참조할 수 있다.

  Parent poly = new Parent();
  Parent poly = new Child();
  Parent poly = new Grandson(); -> Child 하위에 손자가 있다면 가능

  자바에서 부모 타입 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
  이것은 바로 다양한 형태를 차조할 수 있다고 해서 다형적 참조라고 한다.

  Parent poly = new Child(); 이렇게 자식을 참조한 상황에서 poly가 자식 타입인
  Child에 있는 childMethod()를 호출하면 어떻게 될까?
  poly.childMethod()를 실행하면 먼저 참조값을 통해 인스턴스를 찾는다.
  그리고 다음으로 인스턴스 안에서 실행할 타입을 찾아야 한다.
  호출자인 poly는 Parent 타입이다. 따라서 Parent 클래스부터 시작해서 필요한 기능을 찾는다.
  그런데 상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없다.




 */
