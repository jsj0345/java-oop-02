package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
  public static void main(String[] args) {
    Parent parent1 = new Child();
    Child child1 = (Child) parent1;
    child1.childMethod(); // 문제 없음.

    Parent parent2 = new Parent();
    Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
    child2.childMethod(); // 실행 불가.



    /*

    Parent parent2 = new Parent();
    Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
    child2.childMethod();

    Parent parent2 = x001;
    Child child2 = (Child) x001;
    코드를 보면 Parent라는 인스턴스만 생성 된다. 이러한 이유는 상속 관계 일 때 자식 인스턴스를 생성하면 부모까지 같이 생성 되는데
    부모만 생성되면 하위인 것이 없다. 즉, 상위인 부모만 있다. 이러한 상황에서 하위 클래스에 있는 childMethod()를 호출하라 하면 호출 할 수가 없다.
    왜냐하면, 생성 자체가 안됐기 때문.

    이러한 이유로 다운 캐스팅은 오류가 발생 할 수 있다.

     */


    /*

    public class CastingMain3 {
       public static void main(String[] args) {
         Child child = new Child();
         Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장.
         Parent parent2 = child; // 업캐스팅 생략. (부모는 자식을 담을 수 있어서 생략 가능)

         parent1.parentMethod();
         parent2.parentMethod();
       }
     }

     업 캐스팅을 보면 안전하다. 왜 안전할까?
     먼저 Child 인스턴스를 만들면 Parent, Child 둘 다 생긴다.
     이러한 상황에서
     Parent parent1 = child; 업 캐스팅을 하고나서 메서드를 호출 하면 당연히 문제가 없다.
     왜냐하면 모든 인스턴스가 생성 되었기 때문에 (부모 인스턴스, 자식 인스턴스)

     배운 것들을 보면 결국 다운 캐스팅은 위험한 오류가 발생할 수 있다.
     따라서, instance of로 어떤 인스턴스들이 있는지 보고나서 캐스팅을 하는 것이 좋다.

     */

    /*

    컴파일 오류 vs 런타임 오류

    컴파일 오류는 변수명 오타, 잘못된 클래스 이름 사용등 자바 프로그램을 실행하기 전에 발생하는 오류이다.
    이런 오류는 IDE에서 즉시 확인할 수 있기 때문에 안전하고 좋은 오류이다.

    반면에 런타임 오류는 이름 그대로 프로그램이 실행되고 있는 시점에 발생하는 오류이다.
    런타임 오류는 매우 안좋은 오류이다.
    왜냐하면 보통 고객이 해당 프로그램을 실행하는 도중에 발생하기 때문이다.

     */

  }
}
