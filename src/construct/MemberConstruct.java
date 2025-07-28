package construct;

public class MemberConstruct {
  String name; // 멤버 변수
  int age; // 멤버 변수
  int grade; // 멤버 변수

  //추가

  /*
  MemberConstruct(String name, int age){
    this.name = name;
    this.age = age;
    this.grade = 50;
  }

   */

  /*
  위 코드(생성자, 매개변수 2개), 아래 코드(생성자, 매개변수 3개) 코드들을 보면
  this.name , this.age, this.grade가 다 겹친다. 이런 겹치는 부분을 어떻게 제거할까?
  다음 <추가 코드>를 보자.
   */

  //
  MemberConstruct(String name, int age){
    this(name,age,50); // 자기 자신의 생성자를 만든다. this 키워드는 생성자 구현부에 맨 첫째줄에서만 작성 가능.
    // 매개변수가 3개인 생성자를 호출한거임 this로.
    // 첫 번째 생성자 내부에서 두 번째 생성자를 자동으로 호출함.
    // this()를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다.

  }


  MemberConstruct(String name, int age, int grade){
    System.out.println("생성자 호출 name=" + name + " , age="+age+",grade="+grade);
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}


