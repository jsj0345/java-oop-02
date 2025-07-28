package poly.ex3;

public class Dog extends AbstractAnimal {

  @Override // ctrl+o는 overriding
  public void sound() {
    System.out.println("멍멍");
  }
}

/*
package poly.ex3;

public class Dog extends AbstractAnimal {
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
 */
