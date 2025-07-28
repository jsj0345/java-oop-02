package extends1.overriding;

public class CarMain {

  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move();

    GasCar gasCar = new GasCar();
    gasCar.move();
  }
}


/*
package extend1.ex2;

public class CarMain{
  public static void main(String[] args){
    ElectricCar electricCar = new ElectricCar();
    electricCar.move();
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move();
    gasCar.fillUp();
  }
}
 */