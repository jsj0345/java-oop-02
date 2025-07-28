package memory;

public class JavaMemoryMain2 {
  public static void main(String[] args) {
    System.out.println("main start");
    method1();
    System.out.println("main end");
  }

  static void method1() {
    System.out.println("method1 start");
    Data data1 = new Data(10);
    method2(data1);
    System.out.println("method1 end");
  }

  static void method2(Data data2){
    System.out.println("method2 start");
    System.out.println("data.value="+data2.getValue());
    System.out.println("method2 end");
  }

  /*
  main start -> method1 start ->  method2 start -> data.value = 10 -> method2 end -> method1 end  -> main end
  위 순서대로 프로그램이 실행되고 method1에서 Data 인스턴스를 생성하고 참조 변수에 주소값이 할당됨.
  그런데 method2, method1 까지 다 실행했으면 이 주소는 의미가 없다. 이런 객체는 메모리만 차지하게 됨.
  가비지 컬렉션(GC)은 이렇게 참조가 모두 사라진 인스턴스를 찾아서 메모리에서 제거한다.
   */
}

/*

package memory;

public class JavaMemoryMain2{
  public static void main(String[] args){
    System.out.println("main start");
    method1();
    System.out.println("main end");
  }

  static void method1(){
    System.out.println("method1 start");
    Data data1 = new Data(10);
    method2(data1);
    System.out.println("method1 end");
  }

  static void method2(Data data2){
    System.out.println("method2 start");
    System.out.println("data.value="+data2.getValue());
    System.out.println("method2 end");
  }
}

 */
