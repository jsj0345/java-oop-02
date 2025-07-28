package restudy1;

class Student {
  String name;
  int grade;
  int age;
}

public class ClassStart3{
  public static void main(String[] args) {
    Student student1;
    student1 = new Student(); // Student 객체 생성.
    // 객체 생성 이후 new Student()의 결과로 X001 참조값 변환.
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student();
    student2.name= "학생2"; // 클래스를 통해 생성한 객체를 생성하려면 먼저 메모리에 존재하는 객체에 접근해야 한다.
    // 객체에 접근하려면 .(dot)을 사용하면 된다.
    student2.age = 16;
    student2.grade = 80;

    /*
    student2.name ="학생2"; -> student2 객체의 name 멤버 변수에 값을 대입
    x002.name="학생2"; -> 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입.
     */


    System.out.println("이름: "+student1.name +" 나이: "+student1.age+" 성적: "+student1.grade);
    System.out.println("이름: "+student2.name +" 나이: "+student2.age+" 성적: "+student2.grade);

  }
}
