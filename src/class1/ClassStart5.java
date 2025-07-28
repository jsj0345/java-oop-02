package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age=16;
        student2.grade=80;

        Student[] students = new Student[]{student1,student2}; // 여기서 배열은 Student 클래스로 접근 할 수 있는 참조값을 보관하는 역할을 함.
        // 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null로 초기화 된다.
        // 배열이 생성될 때 주소가 생성됨. 이러한 주소를 보관해야함.
        // students[0]= student1;
        // students[1]= student2;
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다. (참조값을 복사하는것.!!) 인스턴스를 대입 하는 것이 아님.!
        // 배열에 객체를 보관함. 자바에서 대입은 항상 변수에 들어 있는 값을 복사함.
        // 변수에는 인스턴스에 접근 할 수 있는 참조값이 들어있는 것이지 인스턴스가 들어있는 것이 아님. 확실하게 이해 해야함.

        for(int i=0; i<students.length; i++)
        {
            System.out.println("이름: "+students[i].name+" 나이:"+students[i].age+" 성적:"+students[i].grade);
        }

        /*
        향상된 for문으로 접근하려면?
        for(Student s : students)
        {
            System.out.println("이름: "+s.name+" 나이:"+s.age+" 성적:"+s.grade);
         }
         */

    }
}