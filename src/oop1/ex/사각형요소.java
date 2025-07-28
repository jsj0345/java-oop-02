package oop1.ex;

public class 사각형요소 {
  int width; // 길이 멤버 변수
  int height; // 높이 멤버 변수

  static int calculatePerimeter(int width, int height){
    return 2 * (width + height);
  }

  static int calculateArea(int width, int height){
    return width * height;
  }

  static boolean isSquare(int width, int height) {
    return width == height;
  }
}


/*
public class 사각형요소 {
  int width;
  int height;

  static int calculatePerimeter(int width , int height){
    return 2 * (width + height);
  }

  static int calculateArea(int width, int height){
    return width * height;
  }

  static boolean isSquare(int width, int height){
    return width == height;
  }

}
 */