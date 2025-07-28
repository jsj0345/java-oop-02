package restudy4.static2.ex;

public class Car {
  private String model;
  private static int count;

  public Car(String model){
    this.model = model;
    System.out.println("차량 구입, "+"이름: "+this.model);
    count++;
  }

  static void showTotalCars(){
    System.out.println("구매한 차량 수: "+Car.count);
  }
}
