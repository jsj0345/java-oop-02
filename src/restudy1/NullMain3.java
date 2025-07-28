package restudy1;

public class NullMain3 {
  public static void main(String[] args) {
    BigData bigData = new BigData();
    System.out.println("bigData.count=" + bigData.count);
    System.out.println("bigData.data=" + bigData.data);

    System.out.println("bigData.data.value=" + bigData.data.value);

    // BigData 클래스 안에 있는 data는 null로 초기화 되어 있으므로 찾아 갈 수 있는 곳이 없으니 NullPointerException 발생.
  }
}
