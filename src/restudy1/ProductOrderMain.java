package restudy1;

public class ProductOrderMain {
  public static void main(String[] args) {
    int sum = 0;
    ProductOrder po1 = new ProductOrder();
    ProductOrder po2 = new ProductOrder();
    ProductOrder po3 = new ProductOrder();

    po1.productName = "두부";
    po1.price = 2000;
    po1.quantity = 2;

    po2.productName = "김치";
    po2.price = 5000;
    po2.quantity = 1;

    po3.productName = "콜라";
    po3.price = 1500;
    po3.quantity = 2;

    ProductOrder[] productorder_list = new ProductOrder[]{po1,po2,po3};

    for(int i=0; i< productorder_list.length; i++){
      System.out.println("상품명: "+productorder_list[i].productName
      +", 가격: "+productorder_list[i].price+", 수량:"+productorder_list[i].quantity);
      sum+=productorder_list[i].price * productorder_list[i].quantity;
    }

    System.out.println("총 결제 금액: "+sum);

  }
}
