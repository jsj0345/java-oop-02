package construct;

public class MethodInitMain2 {
  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    initMember(member1,"user1",15,90);

    MemberInit member2 = new MemberInit();
    initMember(member2,"user2",16,80);


    MemberInit[] members = {member1, member2};

    for(MemberInit member: members){
      System.out.println("이름:"+member.name+" 나이:"+member.age+" 성적:"+member.grade);
    }

    /*
    앞 수업시간 때 배웠던 것처럼 데이터를 저장하고 데이터를 수정할 때는 데이터가 있는 곳에 한꺼번에 처리
    하는 것이 좋다.

    이럴 때, 생성자를 이용해보자.
     */
  }

  static void initMember(MemberInit member, String name, int age, int grade){
    member.name = name;
    member.age = age;
    member.grade = grade;

  }
}