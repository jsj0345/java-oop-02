package static1;

public class Data3 {
  public String name;
  public static int count; // static

  /*
  static int count부분에서 변수 타입 앞에 static 키워드가 붙어있음.
  이렇게 멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라고 부른다.


  static이 붙은 정적 변수에 접근하려면 Data3.count와 같이 클래스명+.(dot)+변수명으로 접근하면 된다.
  참고로 Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략할 수 있다.

  static 변수를 사용한 덕분에 공용 변수를 사용해서 편리하게 문제를 해결할 수 있었다.

  */

  public Data3(String name){
    this.name = name;
    count++; // Data3라는 틀은 1개이므로 클래스 변수도 자신만 존재함. 따라서, Data3.count로 써도되고
    // count만 써도 문제가 없다.
  }
}

/*
package static1;

public class Data3 {
  public String name;
  public static int count;

  static int count 부분에서 변수 타입 앞에 static 키워드가 붙어있음.
  이렇게 멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라고 부른다.

  static이 붙은 정적 변수에 접근하려면 Data3.count와 같이 클래스명+.(dot)+변수명으로 접근하면 된다.
  참고로 Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략할 수 있다.

  static 변수를 사용한 덕분에 공용 변수를 사용해서 편리하게 문제를 해결할 수 있었다.

  public Data3(String name){
    this.name = name;
    count++; // Data3라는 틀은 1개이므로 클래스 변수도 자신만 존재함. 따라서, Data3.count를 써도됨.
    // count만 써도 문제가 된다.
  }
}


 */
