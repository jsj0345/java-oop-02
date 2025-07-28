package oop1.ex;

// 절차 지향 프로그래밍

// 사각형의 넓이와 둘레를 구하는 코드

public class RectangleProceduralMain {
  public static void main(String[] args) {
    사각형요소 element = new 사각형요소();


    int area = 사각형요소.calculateArea(5, 8);
    System.out.println("넓이: " + area);

    int perimeter = 사각형요소.calculatePerimeter(5, 8);
    System.out.println("둘레 길이: " + perimeter);

    boolean square = 사각형요소.isSquare(5, 8);
    System.out.println("정사각형 여부:" + square);


  }


}

/*
public class RectangleProceduralMain{
  public static void main(String[] args) {
    사각형요소 element = new 사각형요소();

    int area = 사각형요소.calculateArea(5,8);
    System.out.println("넓이: " +area);

    int perimeter = 사각형요소.calculatePerimeter(5,8);
    System.out.println("둘레 길이: " + perimeter);

    boolean square = 사각형요소.isSquare(5,8);
    System.out.println("정사각형 여부:" + square);

  }
}
 */
