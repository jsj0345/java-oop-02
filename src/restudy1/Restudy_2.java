package restudy1;

public class Restudy_2 {
  public static void main(String[] args) {
    String[] studentname = new String[]{"학생1","학생2","학생3"};
    int[] score = new int[]{85,90,95};

    for(int i=0; i< studentname.length; i++){
      System.out.println("이름: "+studentname[i]+" 점수: "+score[i]);
    }

  }
}

/*
배열을 사용하면 좋은점이 이전 코드와 다르게 변수를 각각 선언할 필요도 없고 요소를 추가하면 그만임.

그런데 만약에, 위 코드에서 학생2의 데이터를 지우려고 한다면 각각의 배열마다 학생2에 관한 정보를 지워야함.

이러한 문제를 해결하기 위해 클래스를 써보자.

 */


