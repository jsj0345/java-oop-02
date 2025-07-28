package final1;

public class FinalFieldMain {

  public static void main(String[] args) {
    // final 필드 - 생성자 초기화.
    System.out.println("생성자 초기화");

    ConstructInit constructInit1 = new ConstructInit(10);
    ConstructInit constructInit2 = new ConstructInit(20);

    /*
    위 코드 두줄은 인스턴스가 생성되고 서로 당연히 주소값이 다르다.

    이런 경우엔 final int value; 가 있어도 서로 다른 인스턴스에 있는 멤버 변수에 값을 할당하는거니까
    최초 한번씩 할당하는거라 상관없다.
    */


    System.out.println(constructInit1.value); // 10
    System.out.println(constructInit2.value); // 20

    // final 필드 - 필드 초기화
    System.out.println("필드 초기화");
    FieldInit fieldInit1 = new FieldInit();
    FieldInit fieldInit2 = new FieldInit();
    FieldInit fieldInit3 = new FieldInit();

    /*
    fieldInit1, fieldInit2, fieldInit3은 서로 다른 세개의 인스턴스.
    */


    System.out.println(fieldInit1.value); // 고정된 상수 값 10.
    System.out.println(fieldInit2.value);
    System.out.println(fieldInit3.value);

    // 상수 접근 (자바에서는 static final이 붙은걸 상수라 말함.)
    System.out.println("상수");
    System.out.println(FieldInit.CONST_VALUE);


    /*

     */


  }
}
