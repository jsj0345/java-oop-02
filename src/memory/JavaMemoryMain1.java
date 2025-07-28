package memory;

public class JavaMemoryMain1 {

  public static void main(String[] args) {
    System.out.println("main start");
    method1(10);
    System.out.println("main end");

    // ctrl+w 는 범위를 지정하는 블럭을 생성해줌.

  }

  static void method1(int m1) {
    System.out.println("method1 start");
    int cal = m1 * 2;
    method2(cal);
    System.out.println("method1 end");

  }

  static void method2(int m2) {
    System.out.println("method2 start");
    System.out.println("method2 end");

  }


  /*
  결과를 봐서 알겠지만 main 메서드가 가장 나중에 끝난다.
  그냥 메서드 실행 순서만 보면
  main -> method1 -> method2 -> method1 -> main 으로 보면 된다.
  Stack 구조임을 알 수 있다.

  이걸 그림으로 볼라면 교재 7page를 참고하면 된다.


   */
}

/*
package memory;

public class JavaMemoryMain1{
  public static void main(String[] args){
    System.out.println("main start");
    method1(10);
    System.out.println("main end");
   }

   static void method1(int m1){
    System.out.println("method1 start");
    int cal = m1 * 2;
    method2(cal);
    System.out.println("method1 end");
   }

   static void method2(int m2){
     System.out.println("method2 start");
     System.out.println("method2 end");
   }
}




 */
