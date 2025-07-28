package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        int sum = 0;
        ProductOrder order1 = new ProductOrder();
        order1.productName="두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName="김치";
        order2.price=5000;
        order2.quantity=1;

        ProductOrder order3 = new ProductOrder();
        order3.productName="콜라";
        order3.price=1500;
        order3.quantity=2;

        ProductOrder[] order_information = new ProductOrder[3];
        order_information[0]=order1;
        order_information[1]=order2;
        order_information[2]=order3;

        for(ProductOrder po : order_information)
        {

            System.out.println("상품명: "+po.productName+", 가격: "+po.price+", 수량: "+po.quantity);
            sum=sum+(po.price*po.quantity);
        }

        System.out.println("총 결제 금액: "+sum);

        /*
        int sum = 0;
        ProductOrder order1 = new ProductOrder();
        order1.productName="두부";
        order1.price=2000;
        order1.quantity=2;

        ProductOrder order2 = new ProductOrder();
        order2.productName="김치";
        order2.price=5000;
        order2.quantity=1;

        ProductOrder order3=new ProductOrder();
        order3.productName="콜라";
        order3.price=1500;
        order3.quanttiy=2;


         */


    }
}
