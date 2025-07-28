package construct;

public class MemberInit {
  String name;
  int age;
  int grade;

  void initMember(String name, int age, int grade){
    /*
    initMember 메서드 코드 블럭에서 name, age, grade는 매개변수에 있는 값이 우선순위가 된다.
    가장 가까우니까 매개 변수가 우선 순위.
     */
    this.name = name; // this는 자신의 인스턴스를 가리킴.
    this.age = age;
    this.grade = grade;

    /*
    this.name = name;
    this.name = "user1";
    x001.name = "user1";

    매개변수의 이름과 멤버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야 한다.
    this는 인스턴스 자신을 가리킨다.
     */

  }
}

