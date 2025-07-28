package poly.basic;

public class CastingMain6 {
  public static void main(String[] args) {
    Parent parent1 = new Parent();
    System.out.println("parent1 호출");
    call(parent1);

    Parent parent2 = new Child();
    System.out.println("parent2 호출");
    call(parent2);

  }

  private static void call(Parent parent){
    parent.parentMethod();
    if(parent instanceof Child child){
      /*
      parent instanceof Child는
      Child child = new parent(); 이렇게 참조할수 있는지를 물어 보는 것이다.
      이제 위에것이 가능하다면 Child child = (Child) parent; 다운 캐스팅으로 접근.
      이렇게 따로 만들어 줘야 하지만 parent instanceof Child child로 하면 따로 만들어 줄 필요가 없다.

       */
      System.out.println("Child 인스턴스 맞음");
      child.childMethod();
    }
  }
}
