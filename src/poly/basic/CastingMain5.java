package poly.basic;

public class CastingMain5 {

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
    if(parent instanceof Child){
      /*
      parent instanceof Child의 의미는
      parent가 Child의 인스턴스스를 참조하는가?

      A instanceof B가 있다하면
      오른쪽(B)에 있는 타입에 왼쪽(A)에 있는 인스턴스의 타입이 들어갈 수 있는지를 대입해본다.
      대입이 가능하면 true, 불가능하면 false가 된다.
       */
      System.out.println("Child 인스턴스 맞음");
      Child child = (Child) parent;
      child.childMethod();
    }
  }

}

/*
package poly.basic;

public class CastingMain5 {
  public static void main(String[] args) {
    Parent parent1 = new Parent();
    System.out.println("parent1 호출");
    call(parent1);

    Parent parent2 = new Child();
    System.out.println("parent2 호출");
    call(parent2);
  }

  private static void call(Parent parent) {
    parent.parentMethod();

    if(parent instanceof Child) {
      System.out.println("Child 인스턴스 맞음");
      Child child = (Child) parent;
      parent.childMethod();
    } else {
      System.out.println("Child 인스턴스 아님");
    }


*/

