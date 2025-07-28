package restudy4;

public class DataCountMain2 {
  public static void main(String[] args) {
    Counter counter = new Counter();
    Data2 data1 = new Data2("A",counter);
    System.out.println("A count=" + counter.count);

    Data2 data2 = new Data2("B",counter);
    System.out.println("B count="+counter.count);

    Data2 data3 = new Data2("C",counter);
    System.out.println("C count="+counter.count);
  }

  /*
  이 코드는 Data2의 인스턴스가 3개 생성되고, Counter라는 인스턴스까지 생성되어 총 4개다.

  하지만 여기에 불편한 점이 좀 있다.
  Data2 클래스와 관련된 일인데, Counter라는 별도의 클래스를 추가로 사용해야 한다.
  생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
   */
}
