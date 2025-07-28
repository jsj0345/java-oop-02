package poly.basic;

public class CastingMain1 {

  public static void main(String[] args) {
    //부모 변수가 자식 인스턴스 참조(다형적 참조)
    Parent poly = new Child(); // x001
    //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
    //poly.childMethod();

    //다운캐스팅(부모 타입 -> 자식 타입)
    Child child = (Child) poly; // x001
    child.childMethod();
  }
}


/*
Parent poly = new Child(); 에서
poly.childMethod()를 호출하면 먼저 참조값을 사용해서 인스턴스를 찾는다.
이때 인스턴스는 Child 인스턴스이고 poly가 Parent형이므로
Parent형에 맞게 찾아간다.
그런데 Parent는 부모이므로 자식을 찾아갈 수 없다.
따라서, poly.childMethod()는 불가능하다. (컴파일 오류 발생)

Parent parent = new Child(); -> 부모는 자식을 담을 수 있다.
Parent parent = child; // Child child 변수: 부모는 자식을 담을 수 있다.

반며에 다음과 같이 자식은 부모를 담을 수 없다.
Child child = poly // Parent poly 변수.

부모 타입을 사용하는 변수를 자식 타입에 대입하려고 하면 컴파일 오류가 발생한다.
자식은 부모를 담을 수 없다.
이때는 다운캐스팅이라는 기능을 사용해서 부모 타입을 잠깐 자식타입으로 변경하면 된다.

Child child = (Child) poly; //

(타입) 처럼 괄호와 그 사이에 타입을 지정하면 참조 대상을 특정 타입으로 변경할 수 있다.
이렇게 특정 타입으로 변경 하는 것을 캐스팅이라 한다.
오른쪽에 있는 (Child) poly 코드를 먼저 보자. poly는 Parent 타입이다.
이 타입을 (Child)를 사용해서 일시적으로 자식 타입인 Child 타입으로 변경한다.
그리고 나서 왼쪽에 있는 Child child에 대입한다.

형태를 변환하는 이유는 자식으로 변경해야 자식에 있는 것들도 접근 할 수 있기 때문.

그리고 애초에 참조 변수로 인스턴스에 접근 할 때, 그 참조변수의 형태를 가지고 접근하기 때문에 형을 바꿔줘야함.
이 말을 예를 들어서 poly.childMethod()라 하면 poly는 Parent형이므로 parent에 먼저 접근함.
형태를 안바꿔주면 이제 자식으로 못 내려가기 때문에 바꾸는 것.




 */