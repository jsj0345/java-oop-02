package poly.ex1;

public class AnimalSoundMain {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow();

    System.out.println("동물 소리 테스트 시작");
    dog.sound();
    System.out.println("동물 소리 테스트 종료");

    System.out.println("동물 소리 테스트 시작");
    cat.sound();
    System.out.println("동물 소리 테스트 종료");

    System.out.println("동물 소리 테스트 시작");
    cow.sound();
    System.out.println("동물 소리 테스트 종료");

    /*
    이 코드의 단점은 동물을 추가할 때마다 중복 코드가 많이 생긴다.
    이럴땐 어떻게 해결해야 할까?
     */

    /*
    중복 제거를 위해 메서드를 생성해보자.
     */
  }

  /*
  private static void soundCow (Cow cow) {
    System.out.println("동물 소리 테스트 시작");
    cow.sound();
    System.out.println("동물 소리 테스트 종료");
  }

  이런식으로 메서드로 중복 제거를 시도하려 하면 문제가 Cow형 변수만 매개변수로 들어갈 수 있다.
  타입이 서로 달라서 문제다.
   */

  /*
  배열을 생성해서 중복 제거를 시도해보자.
  Cow[] cowArr = new Cow[]{cat,dog,cow};
  System.out.println("동물 소리 테스트 시작");
  for (Cow cow : cowArr) {
   cow.sound();
  }
  System.out.println("동물 소리 테스트 종료");

  배열과 for문을 사용해서 중복을 제거하려고 해도 배열의 타입을 Dog, Cat, Cow 중에 하나로 지정해야 한다.
  같은 cow들을 배열에 담아서 처리하는 것은 가능하지만 타입이 서로 다른 Dog,Cat,Cow를 하나의 배열에 담는 것은
  불가능하다.
   */

}

/*
package poly.ex1;

public class AnimalSoundMain {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow();

    System.out.println("동물 소리 테스트 시작");
    dog.sound();
    System.out.println("동물 소리 테스트 종료");

    System.out.println("동물 소리 테스트 시작");
    cat.sound();
    System.out.println("동물 소리 테스트 종료");

    System.out.println("동물 소리 테스트 시작");
    cow.sound();
    System.out.println("동물 소리 테스트 종료");
  }
}

 */
