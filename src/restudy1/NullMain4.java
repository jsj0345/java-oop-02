package restudy1;

public class NullMain4 {
  public static void main(String[] args) {
    BigData bigData = new BigData();
    bigData.data = new Data(); // 주소 할당.

    System.out.println("bigData.count="+bigData.count);
    System.out.println("bigData.count="+bigData.data);
    System.out.println("bigData.count="+bigData.data.value);

  }
}
