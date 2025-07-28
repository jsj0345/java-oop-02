package final1;

public class FinalRefMain {
  public static void main(String[] args) {
    final Data data = new Data();

    /*
    final Data data; // 참조형
    data = new Data();
    */

    /*
    아래 코드가 가능한 이유는 뭘까?
    위에 final Data data = new Data();는
    참조값을 변경 할 수 없는것이지 참조값으로 접근 할 수 있는 인스턴스의 멤버 변수들은 변경 가능함.
    */

    data.value = 10;
    System.out.println(data.value);
    data.value = 20;
    System.out.println(data.value);

  }
}

/*
package final1;

public class FinalRefMain{
  public static void main(String[] args) {
    final Data data = new Data();

    final Data data; -> 참조형
    data = new Data();

    아래 코드가 가능한 이유는 뭘까?
    위에 final Data data = new Data(); 는
    참조값을 변경 할 수 없는것이지 참조값으로 접근 할 수 있는 인스턴스의 멤버 변수들은 변경 가능.

    data.value = 10;
    System.out.println(data.value);
    data.value = 20;
    System.out.println(data.value);
  }
}


 */
