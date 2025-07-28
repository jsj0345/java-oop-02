package access.ex;

public class ShoppingCart {
  private Item[] items = new Item[10];
  private int itemCount;

  // TODO 나머지 코드를 완성해라.
  public void addItem(Item item){
    if(itemCount<10) {
      items[itemCount] = item;
      itemCount++;
    }
    else{
      System.out.println("장바구니가 가득 찼습니다.");
    }

  }

  public void displayItems(){
    // for문을 돌릴 때, itemcount까지만 내용물이 있으니 (int i=0; i < itemCount; i++)라고 작성해도 문제없음.
    int total_price = 0;
    System.out.println("장바구니 상품 출력");
    for(Item i : items){
      if(i==null){
        break;

        /*
        좌변.equals(우변)을 쓴다고 가정해보자.
        좌변에는 객체가 있어야한다.
        근데 null은 객체 없음을 의미하므로
        null.equals(우변) 자체가 성립하지 않는다.
         */
      }
      System.out.println("상품명:"+i.getName()+", 합계:"+i.getTotalPrice());
      total_price +=i.getTotalPrice();
    }

    System.out.println("전체 가격 합:"+total_price);

  }


}
