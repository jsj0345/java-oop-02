package restudy1.oop_1.ex;

public class Rectangle {
  int width;
  int height;
  boolean square;

  int calculateArea(){
    return width * height;
  }

  int calculatePerimeter(){
    return 2 * (width + height);
  }

  boolean isSquare(){
    return width == height;
  }
}
