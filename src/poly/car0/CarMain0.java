package poly.car0;

public class CarMain0 {
  public static void main(String[] args) {
    Driver driver = new Driver();
    K3Car k3Car = new K3Car();
    driver.setK3Car(k3Car);
    driver.drive();

    //추가
    Model3Car model3Car = new Model3Car();
    driver.setK3Car(null);
    driver.setModel3Car(model3Car);
    driver.drive();


    /*
    근데 차가 많아지면 코드의 길이는 길어지고 지저분해짐.

    이럴 땐 어떻게 하는게 좋을까?
     */
  }
}


/*
package poly.car0;

public class CarMain0 {
  public static void main(String[] args) {
    Driver driver = new Driver();
    K3Car k3Car = new K3Car();
    driver.setK3Car(k3Car);
    driver.drive();
  }
}
 */