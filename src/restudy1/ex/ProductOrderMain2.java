package restudy1.ex;



public class ProductOrderMain2 {
  public static void main(String[] args) {
    int total_amount = 0;
    ProductOrder[] order_list = new ProductOrder[3];
    order_list[0]=createOrder("두부",2000,2);
    order_list[1]=createOrder("김치",5000,1);
    order_list[2]=createOrder("콜라",1500,2);
    printOrders(order_list);
    total_amount = getTotalAmount(order_list);
    System.out.println("총 결제 금액: "+total_amount);




  }

  static ProductOrder createOrder(String productName, int price, int quantity){
    ProductOrder productorder = new ProductOrder();
    productorder.productName = productName;
    productorder.price = price;
    productorder.quantity = quantity;
    return productorder;
  }

  static void printOrders(ProductOrder[] orders){
    for(int i=0; i<orders.length; i++){
      System.out.println("상품명: "+orders[i].productName+", 가격:"+orders[i].price+", 수량:"+orders[i].quantity);
    }
  }

  static int getTotalAmount(ProductOrder[] orders){
    int total_amount = 0;
    for(int i=0; i< orders.length; i++){
      total_amount+=orders[i].price * orders[i].quantity;
    }

    return total_amount;

  }






}




