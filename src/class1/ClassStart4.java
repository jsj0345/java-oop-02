package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age=16;
        student2.grade=80;

        Student[] students = new Student[2]; // 여기서 배열은 Student 클래스로 접근 할 수 있는 참조값을 보관하는 역할을 함.
        // 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null로 초기화 된다.
        // 배열이 생성될 때 주소가 생성됨. 이러한 주소를 보관해야함.
        students[0]= student1;
        students[1]= student2;
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다. (참조값을 복사하는것.!!) 인스턴스를 대입 하는 것이 아님.!
        // 배열에 객체를 보관함. 자바에서 대입은 항상 변수에 들어 있는 값을 복사함.
        // 변수에는 인스턴스에 접근 할 수 있는 참조값이 들어있는 것이지 인스턴스가 들어있는 것이 아님. 확실하게 이해 해야함.

        System.out.println("이름: "+students[0].name+" 나이:"+students[0].age+" 성적:"+students[0].grade);
        System.out.println("이름: "+students[1].name+" 나이:"+students[1].age+" 성적:"+students[1].grade);


        Student student0 = new Student();
        System.out.println(student0.name);
        System.out.println(student0.age);
        System.out.println(student0.grade);

        // 인스턴스를 생성하면 각각 고유한 주소가 따로 생성되므로 ,student2에서 내용물을 바꿨다고해서 student0에서는 바뀐 내용물이 대입 되는 것이 아니다.


       /*
       Student student1 = new Student();
       student1.name = "학생1";
       student1.age = 16;
       student1.score = 90;

       Student student2 = new Student();
       student2.name = "학생2";
       student2.age = 15;
       student2.score = 80;

       Student[] students = new Student[2]; // 여기서 배열은 Student 클래스로 접근 할 수 있는 참조값을 보관하는 역할을 함.
       // 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없는 null로 초기화.
       // 배열이 생성될 때 주소를 생성. 이러한 주소를 보관해야함.
       students[0]= student1;
       students[1]= student2;

       자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다. (참조값을 복사하는것.!!) 인스턴스를 대입 하는 것은 아님.
       배열에 객체를 보관함. 자바에서 대입은 항상 변수에 들어 있는 값을 복사함.
       변수에는 인스턴스에 접근 할 수 있는 참조값이 들어있는 것이지 인스턴스가 들어 있는 것이 아님. 확실하게 이해 해야함.

       System.out.println("이름: "+students[0].name+" 나이:"+students[0].age+" 성적:"+students[0].grade);
       System.out.println("이름: "+students[1].name+" 나이:"+students[1].age+" 성적:"+students[1].grade);


        */

    }
}
