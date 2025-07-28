package poly.ex5;

// 인터페이스를 상속 받을 때는 implements를 쓴다.

public class Dog implements InterfaceAnimal {

  @Override
  public void sound() {
    System.out.println("멍멍");
  }

  @Override
  public void move() {
    System.out.println("개 이동");
  }
}

/*
package poly.ex5;

// 인터페이스를 상속 받을 때는 implements를 쓴다.

public class Dog implements InterfaceAnimal {

  @Override
  public void sound() {
    System.out.println("멍멍");
  }

  @Override
  public void move() {
    System.out.println("개 이동");
  }
}
 */
