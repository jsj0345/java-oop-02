package static1;

public class DataCountMain1 {
  public static void main(String[] args) {
    Data1 data1 = new Data1("A");
    System.out.println("A count=" + data1.count);

    Data1 data2 = new Data1("B");
    System.out.println("B count=" + data2.count);

    Data1 data3 = new Data1("C");
    System.out.println("C count=" + data3.count);

    /*
    의도 했던 것은 객체를 생성할때마다 객체의 개수를 카운트 하려고 하는건데
    위 코드는 결과가 1 1 1로 나온다.
    이러한 이유는 data1, data2, data3이 Data1이라는 클래스를 쓰더라도
    각각 다른 인스턴스가 생성 되기 때문에.. 인스턴스에 있는 멤버 변수들은 다 다른 변수들이다.

     */

  }
}

/*
package static1;

public class DataCountMain1{

  public static void main(String[] args){
    Data1 data1 = new Data1("A");
    System.out.println("A count=" + data1.count);

    Data1 data2 = new Data1("B");
    System.out.println("B count=" + data2.count);

    Data1 data3 = new Data1("C");
    System.out.println("C count=" + data3.count);
  }
}
 */
