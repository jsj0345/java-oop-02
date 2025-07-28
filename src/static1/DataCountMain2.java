package static1;

public class DataCountMain2 {

  public static void main(String[] args) {
    Counter counter = new Counter();

    Data2 data1 = new Data2("A",counter);
    System.out.println("A count="+counter.count);

    Data2 data2 = new Data2("B",counter);
    System.out.println("B count="+counter.count);

    Data2 data3 = new Data2("C",counter);
    System.out.println("C count="+counter.count);

    /*
    이 코드에서는 인스턴스가 생성될 때 마다 카운트값이 올라서 몇개의 인스턴스가 생성 됐는지 알 수 있다.

    그런데 문제점은 Counter라는 외부 인스턴스에서 카운트 하는 것이 불편함.
    Data2 안에서 카운트를 하는 방법은 없을까?


    */
  }
}

/*
package static1;

public class DataCountMain2 {
  public static void main(String[] args){
    Counter counter = new Counter();
    Data2 data1 = new Data2("A", counter);
    System.out.println("A count=" + counter.count);

    Data2 data2 = new Data2("B", counter);
    System.out.println("B count=" + counter.count);

    Data2 data3 = new Data2("C", counter);
    System.out.println("C count=" + counter.count);
 }
}
 */
