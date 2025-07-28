package restudy1;

public class NullMain1 {
  public static void main(String[] args) {

    Data data = null; // Data 타입을 받을 수 있는 참조형 변수 data를 만들었다. 여기에 null 값을 할당했음. 따라서 data변수에는 아직 가리키는 객체가 없음.
    System.out.println("1. data = " + data);
    data = new Data();
    System.out.println("2. data = " + data);
    data = null;
    System.out.println("3. data = " + data);

  }
}
