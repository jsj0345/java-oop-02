package static2.ex;

public class Car {

  private String car_name;
  private static int car_quantity;

  public Car(String name){
    Car.car_quantity++;
    this.car_name = name;
    System.out.println("차량 구입, "+"이름:"+this.car_name);
  }

  static void showTotalCars(){
    System.out.println("구매한 차량 수: "+car_quantity);
  }




}
