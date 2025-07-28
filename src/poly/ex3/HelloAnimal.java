package poly.ex3;

public class HelloAnimal extends AbstractAnimal {
  /*

  HelloAnimal은 AbstractAnimal을 상속 받음.
  그런데 만약에 HelloAnimal에서 AbstractAnimal 클래스에 있는 sound 메서드를 오버라이딩 하지 않는다면
  불안전한 메서드를 상속 받는 것이므로 인스턴스를 생성하지 못하게끔 abstract를 class 앞에 붙여줘야 한다.

  오버라이딩을 하면 이제 메서드가 안정적이므로 문제가 없다.

   */

  @Override
  public void sound() {

  }



}
