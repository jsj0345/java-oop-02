package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    static ProductOrder createOrder(String productName, int price, int quantity){
         ProductOrder order = new ProductOrder();
         order.productName=productName;
         order.price=price;
         order.quantity=quantity;

         return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder o : orders){
            System.out.println("상품명: "+o.productName+", 가격: "+o.price+", 수량: "+o.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for(ProductOrder o: orders){
            sum+=o.price*o.quantity;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i<=n-1; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i]=createOrder(productName,price,quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders); // ctrl+alt+v를 누르면 int totalAmount가 자동적으로 완성.

        System.out.println("총 결제 금액: "+totalAmount);



    }




    /*
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.print("입력 할 주문의 개수를 입력하세요:");
         int n = scanner.nextInt();
         scanner.nextLine();

         ProductOrder[] orders = new ProductOrder[n];

         for(int i=0; i<=n-1; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,quantity);

            printOrders(orders);

            int totalAmount = getTotalAmount(orders); // ctrl+alt+v를 누르면 int totalAmount가 자동적으로 완성.

            System.out.println("총 결제 금액:"+totalAmount);



         }


    }


     */
}
