package extends1.ex1;

public class CarMain {

  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move();
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move();
    gasCar.fillUp();
  }

  /*
  이 코드를 보면 자동차라는 개념이있고 전기차, 가솔린차는 차의 하위 개념이다.
  두 자동차가 이동하는 건 서로 공통된 기능이다.
  따라서, 이럴 땐 "상속"을 이용해보는게 좋다. 
   */

}
