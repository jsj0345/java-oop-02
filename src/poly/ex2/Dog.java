package poly.ex2;

public class Dog extends Animal{

  // ctrl+o는 Override의 단축키.
  @Override
  public void sound() {
    System.out.println("멍멍");
  }

}

/*
package poly.ex2;

public class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
 */
