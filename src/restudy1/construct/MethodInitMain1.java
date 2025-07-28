package restudy1.construct;

public class MethodInitMain1 {

  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    member1.name = "user1";
    member1.age = 15;
    member1.grade = 90;

    MemberInit member2 = new MemberInit();
    member2.name = "user2";
    member2.age = 16;
    member2.grade = 80; // 회원 객체를 제대로 사용하기 위해서는 객체를 생성하자 마자 이런 초기값을 설정해야 하는 불편함이 있음.
    // 초기화 하는것이 반복되므로 제거 해야 할 필요성이 있음.

    MemberInit[] members = new MemberInit[]{member1,member2};

    for(MemberInit s : members){
      System.out.println("이름:"+s.name+" 나이:"+s.age+" 성적:"+s.grade);
    }

  }

  /*
  static void initMember(MemberInit member, String name, int age, int grade){
    member.name = name;
    member.age = age;
    member.grade = grade;
  }

   */

}


