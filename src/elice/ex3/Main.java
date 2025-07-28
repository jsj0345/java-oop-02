package elice.ex3;

class Character {
  // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
  public String name;
  public String nickname;
  public int HP = 100;
  public int AP = 0;
  public String[] inventory = { "물약", "칼", "갑옷" };

  // 여기에 메서드를 작성해 주세요.
  public void printDashboard(){
    System.out.println("====================");
    System.out.println("이름: "+name);
    System.out.println("별명: "+nickname);
    System.out.println("체력: "+HP);
    System.out.println("공격력: "+AP);
    System.out.println("====================");
  }

  public boolean isInventoryEmpty(){
    int checkpoint = 0;
    for(String item : inventory){
      if(item.isEmpty()){
        checkpoint++;
      }
    }

    if(checkpoint==inventory.length){
      return true;
    }
    else{
      return false;
    }

  }
}

public class Main {
  public static void main(String args[]) {
    Character ch = new Character();

    ch.name = "헬로빗";
    ch.nickname = "Hellobit";

    ch.printDashboard();
    System.out.println(ch.isInventoryEmpty());
  }
}