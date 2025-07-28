package construct;

public class MemberThis {
  String nameField;

  void initMember(String nameParameter){
    nameField = nameParameter;

    // 여기서는 멤버 변수와 매개변수의 이름이 다르다.

    /*
    nameParameter는 메서드 블럭 안에 가장 가깝게 위치 한 것이 매개변수이므로
    nameParameter는 매개변수의 값으로 초기화 된다.

    nameField는 initMember라는 메서드 블럭 안에 동일한 이름이 없고
    MemberThis라는 클래스에 nameField라는 멤버 변수가 있으므로
    nameField는 멤버 변수 nameField를 뜻함.
    이런 경우에는 nameField에 this가 생략 되었다고 생각하면 된다. 
     */
  }
}


