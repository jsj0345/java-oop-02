package extends1.ex2;

public class CarMain {

  public static void main(String[] args) {

    ElectricCar electricCar = new ElectricCar();
    electricCar.move();
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move();
    gasCar.fillUp();

  }
}


/*
package extends1.ex2;

public class CarMain {
  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move();
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move();
    gasCar.fillUp();
   }
 }

전기차와 가솔린차가 Car를 상속 받은 덕분에 electricCar.move()
gasCar.move()를 사용할 수 있다.

참고로 당연한 이야기지만 상속은 부모의 기능을 자식이 물려 받는 것이다.

따라서 자식이 부모의 기능을 물려 받아서 사용할 수 있다.
반대로 부모 클래스는 자식 클래스에 접근할 수 없다.
자식 클래스는 부모 클래스의 기능을 물려 받기 때문에 접근할 수 있지만,
그 반대는 아니다. 부모 코드를 보자! 자식에 대한 정보가 하나도 없다.
반면에 자식 코드는 extends Car를 통해서 부모를 알고 있다.

단일 상속
참고로 자바는 다중 상속을 지원하지 않는다.
그래서 extends 대상은 하나만 선택할 수 있다.
부모를 하나만 선택할 수 있다는 뜻이다.
물론 부모가 또 다른 부모를 하나 가지는 것은 괜찮다.

상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다.
현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면
컴파일 오류가 발생한다.

 */