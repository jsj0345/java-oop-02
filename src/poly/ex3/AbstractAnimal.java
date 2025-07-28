package poly.ex3;

public abstract class AbstractAnimal {
  public abstract void sound(); // 오버라이딩이 목적

  public void move() { // 자식 클래스도 쓰기 위해 구현 한 것.
    System.out.println("동물이 움직입니다.");
  }

}


/*
package poly.ex3;

public abstract class AbstractAnimal {
  public abstract void sound();

  public void move() {
    System.out.println("동물이 움직입니다.");
  }
}
 */