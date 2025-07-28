package poly.ex2;

public class AnimalPolyMain3 {
  public static void main(String[] args) {
    Animal[] animalArr = new Animal[]{new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};


    for(Animal animal : animalArr) {
      soundAnimal(animal);
    }

  }

  // 변하지 않는 부분
  private static void soundAnimal(Animal animal) {
    System.out.println("동물 소리 테스트 시작");
    animal.sound();
    System.out.println("동물 소리 테스트 종료");
  }

  /*
  이제 코드를 어느정도 수정 했지만 아직 2가지 문제점이 있다.
  먼저 첫번째로 Animal 클래스를 생성할 수 있는 문제가 있다.
  Animal 클래스는 동물이라는 클래스다. 이 클래스를 다음과 같이 직접 생성해서 사용할 일이 있을까?
  Animal animal = new Animal();

  Animal 클래스는 다형성을 위해서 필요한 것이지 직접 인스턴스를 생성해서 사용할 일은 없다.

  하지만 Animal도 클래스이기 때문에 인스턴스를 생성하고 사용하는데 아무런 제약이 없다.
  누군가 실수로 new Animal()을 사용해서 Animal의 인스턴스를 생성할 수 있다는 것이다.
  이렇게 생성된 인스턴스는 작동은 하지만 제대로 된 기능을 수행하지는 않는다.

  두번째 문제점은 Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성이다.

  예를 들어서, Animal을 상속 받은 Pig 클래스를 만든다고 가정해보자.
  우리가 기대하는 것은 Pig클래스가 sound() 메서드를 오버라이딩해서
  "꿀꿀" 이라는 소리가 나도록 하는 것이다.
  그런데 개발자가 실수로 sound() 메서드를 오버라이딩 하는 것을 빠트릴 수 있다.
  이렇게 되면 부모의 기능을 상속 받는다.

   */

  /*
  이제 코드를 어느정도 수정 했지만 아직 2가지 문제점이 있다.
  먼저 첫번째로 Animal 클래스를 생성할 수 있는 문제가 있다.
  Animal 클래스는 동물이라는 클래스다. 이 클래스를 다음과 같이 직접 생성해서 사용할 일이 있을까?
  Animal animal = new Animal();

  Animal 클래스는 다형성을 위해서 필요한 것이지 직접 인스턴스를 생성해서 사용할 일은 없다.

  하지만 Animal도 클래스이기 때문에 인스턴스를 생성하고 사용하는데 아무런 제약이 없다.
  누군가 실수로 new Animal()을 사용해서 Animal의 인스턴스를 생성할 수 있다는 것이다.
  이렇게 생성된 인스턴스는 작동은 하지만 제대로 된 기능을 수행하지는 않는다.

  두번째 문제점은 Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성이다.

  예를 들어서, Animal을 상속 받은 Pig 클래스를 만든다고 가정해보자.
  우리가 기대하는 것은 Pig 클래스가 soudn() 메서드를 오버라이딩해서
  "꿀꿀" 이라는 소리가 나도록 하는 것이다.
  그런데 개발자가 실수로 sound() 메서드를 오버라이딩 하는 것을 빠트릴 수 있다.
  이렇게 되면 부모의 기능을 상속 받는다.
  */



}




/*
package poly.ex2;

public class AnimalPolyMain3 {
  public static void main(String[] args) {
    Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
    for(Animal animal : animalArr) {
      soundAnimal(animal);
   }

   //동물이 추가 되어도 변하지 않는 코드
   private static void soundAnimal(Animal animal) {
     System.out.println("동물 소리 테스트 시작");
     animal.sound();
     System.out.println("동물 소리 테스트 종료");
   }
}

 */
