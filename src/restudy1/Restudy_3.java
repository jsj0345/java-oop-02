package restudy1;

public class Restudy_3 {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student();
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    Student[] students = new Student[2];
    students[0] = student1; // 주의해야 할 것 students 배열 안에 있는 요소들은 주소값들임. 인스턴스 자체를 가리키는 것이 아님.
    students[1] = student2;

    for(int i=0; i<students.length; i++){
      System.out.println("이름: "+students[i].name+" 나이: "+students[i].age+" 점수: "+students[i].grade);
    }
  }
}
