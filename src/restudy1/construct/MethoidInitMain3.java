package restudy1.construct;

public class MethoidInitMain3 {

  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    member1.initMember("user1",15,90);

    MemberInit member2 = new MemberInit();
    member2.initMember("user2",16,80);
    // 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
    // 멤버 변수에 접근하려면 앞에 this. 이라고 해주면 된다. 여기서 this는 인스턴스 자신의 참조값을 가리킴.

    MemberInit[] members = new MemberInit[]{member1,member2};

    for(MemberInit s : members){
      System.out.println("이름:"+s.name+" 나이:"+s.age+" 성적:"+s.grade);
    }

  }
}
