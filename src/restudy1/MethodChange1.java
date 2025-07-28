package restudy1;

public class MethodChange1 {

  public static void main(String[] args) {
    int a = 10;
    System.out.println("메서드 호출 전: a = " + a);
    changePrimitive(a);
    System.out.println("메서드 호출 후: a = " + a);
  }

  static void changePrimitive(int x){
    x = 20;
  }

}


/*
자바에서 대입은 값을 복사 하는 것을 의미한다.
 */