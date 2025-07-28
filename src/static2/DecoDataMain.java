package static2;

import static static2.DecoData.*;

// import static은 정적 메서드 뿐만 아니라 정적 변수에도 사용할 수 있다.


public class DecoDataMain {

  public static void main(String[] args) {
    System.out.println("1. 정적 호출");
    DecoData.staticCall();
    staticCall();

    /*
    만약에 staticCall 메서드를 많이 호출 해야 하는 경우가 있다고 생각해보자.
    매번 클래스명.staticCall(); 을 쓰기가 번거롭다.
    그래서 import static static2.DecoData.staticCall;
    또는
    import static static2.DecoData.*; 을 써보자.
     */

    System.out.println("2. 인스턴스 호출1");
    DecoData data1 = new DecoData();
    data1.instanceCall();

    System.out.println("3. 인스턴스 호출2");
    DecoData data2 = new DecoData();
    data2.instanceCall();

    //추가
    //인스턴스를 통한 접근

    DecoData data3 = new DecoData();
    data3.staticCall(); // 가능은 한데 추천하진 않음.
    // 이렇게 쓰면 인스턴스 호출같은 느낌이라 별로.


    //클래스를 통한 접근
    DecoData.staticCall();

  }
}

// main() 메서드는 정적 메서드다.

/*
public class ValueDataMain {
  public static void main(String[] args) {
    ValueData valueData = new ValueData();
    add(valueData);
  }

  static void add(ValueData valueData){
    valueData.value++;
    System.out.println("숫자 증가 value=" + valueData.value);
  }
}

여기서 main 메서드에서 add를 보면 그냥 add만 나와있다.
당연히 정적 메서드니까 add만 써도 문제없다.
만약에 정적 메서드가 아니라면 인스턴스 메서드니까
인스턴스를 생성하고나서 인스턴스.메서드(); 이런식으로 써야 했을 것이다.
근데 이렇게 되면 main 메서드는 static이니까 당연히 쓸 수 없다.


 */
