package extends1.super2;

public class ClassB extends ClassA{

  public ClassB(int a){
    // this(a,0); // 여기서는 this로 같은 클래스 내에 있는 생성자를 호출
    super();
    System.out.println("ClassB 생성자 a=" + a);
  }

  public ClassB(int a, int b){
    super(); // 기본 생성자 생략 가능 , 위에서 매개변수가 2개인 생성자를 호출했지만 부모 클래스에 있는 생성자를 반드시 한번은 호출해야함.
    System.out.println("ClassB 생성자 a=" + a + " b="+b);
  }

}
