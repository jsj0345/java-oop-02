package final1;

public class ConstantMain1 {

  public static void main(String[] args) {
    System.out.println("프로그램 최대 참여자 수 " + 1000);
    // 여기서 1000이라는 값만 있고 최대 참여자 수라는 말이 없으면 코드를 짤 때 헷갈릴 수 있다.
    /*
    따라서, 상수를 써보는게 좋을 듯 하다.

    그리고 만약에 저 1000이라는 값을 2000,3000으로 바꿔야 하면 매번 바꿔줘야 한다.
    이럴때 static final을 이용하여 값을 한번만 바꿔주면 편리하다. (물론 프로그램 실행 중에는 못 바꿈.)
     */
    int currentUserCount = 999;

    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);

  }

  private static void process(int currentUserCount){
    System.out.println("참여자 수:"+currentUserCount);

    if(currentUserCount > 1000){
      System.out.println("대기자로 등록합니다.");
    }
    else {
      System.out.println("게임에 참가합니다.");
    }

  }

}

/*
package final1;

public class ConstantMain1 {

  public static void main(String[] args) {
    System.out.println("프로그램 최대 참여자 수 "+1000);
    // 여기서 1000이라는 값만 있고 최대 참여자 수라는 말이 없으면 코드를 짤 때 헷갈릴 수 있다.

    따라서, 상수를 써보는게 좋을 듯 하다.

    그리고 만약에 저 1000이라는 값을 2000, 3000으로 바꿔야 하면 매번 바꿔줘야 한다.
    이럴때 static final을 이용하여 값을 한번만 바꿔주면 편리하다. (물론 프로그램 실행 중에는 못 바꿈.)

    int currentUserCount = 999;

    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
   }

   private static void process(int currentUserCount){
     System.out.println("참여자 수:"+currentUserCount);

     if(currentUserCount > 1000){
       System.out.println("대기자로 등록합니다.");
     }
     else {
       System.out.println("게임에 참가합니다.");
     }

  }
 */

