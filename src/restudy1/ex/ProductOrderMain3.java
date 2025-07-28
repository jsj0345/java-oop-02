package restudy1.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ProductOrder[] order_list = new ProductOrder[3];

    System.out.print("입력할 주문의 개수를 입력하세요:");
    int amount = scanner.nextInt();
    scanner.nextLine();


    for(int i=1; i<=amount; i++){
      System.out.println(i+"번째 주문 정보를 입력하세요.");
      System.out.print("상품명: ");
      String productName = scanner.nextLine();
      System.out.print("가격: ");
      int price = scanner.nextInt();
      scanner.nextLine();
      System.out.print("수량: ");
      int quantity = scanner.nextInt();
      scanner.nextLine();
      order_list[i-1]=createOrder(productName,price,quantity);
    }



    int total_amount = 0;
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
