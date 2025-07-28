package construct;

public class MethodInitMain1 {
  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    member1.name = "user1";
    member1.age = 15;
    member1.grade = 90;
    /*
    객체를 생성하자마자 멤버 변수에 있는 값들을 초기화 함.
    근데 이게 여러개가 있으면 계속 반복해서 초기화 해줘야함.
    다소 불편함.
    이럴때 생성자를 이용해보는게 좋음.
     */

    MemberInit member2 = new MemberInit();
    member2.name = "user2";
    member2.age  = 16;
    member2.grade = 80;

    MemberInit[] members = {member1, member2};

    for(MemberInit member: members){
      System.out.println("이름:"+member.name+" 나이:"+member.age+" 성적:"+member.grade);
    }
  }
}



