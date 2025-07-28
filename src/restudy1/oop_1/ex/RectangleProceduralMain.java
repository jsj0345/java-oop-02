package restudy1.oop_1.ex;

/*
객체 지향 프로그래밍으로 만들고 싶으면 넓이, 정사각형 여부, 둘레 구하는 것을 인스턴스에 구현.
메인 메서드에서는 기능을 사용하게끔 만들어보기.
 */

public class RectangleProceduralMain {
  public static void main(String[] args) {
    int width = 5;
    int height = 8;
    int area = calculateArea(width, height);
    System.out.println("넓이: "+area);

    int perimeter = calculatePerimeter(width, height);
    System.out.println("둘레 길이: " +perimeter);

    boolean square = isSquare(width, height);
    System.out.println("정사각형 여부: " +square);
  }

  static int calculateArea(int width, int height){
    return width * height;
  }

  static int calculatePerimeter(int width, int height){
    return 2 * (width + height);
  }

  static boolean isSquare(int width, int height) {
    return width == height;
  }
}
