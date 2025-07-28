package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 학생을 담아둘수 있는 변수 선언 (Student형의 변수를 선언.)
        student1= new Student(); // 객체, 인스턴스. 학생을 실제 메모리에 만듬. 만들고 나서 학생에 대한 정보를 student1 변수에 담아둠.
        // 참조값을 student1에 초기화. student1 = x001; 이때 인스턴스를 생성하는거긴 하나 student1에는 인스턴스가 들어 있는게 아니라 주소 값이 들어가있는것.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:"+student1.name+" 나이:"+student1.age+" 성적:"+student1.grade);
        System.out.println("이름:"+student2.name+" 나이:"+student2.age+" 성적:"+student2.grade);

        System.out.println(student1);
        System.out.println(student2);


        /*
        Student student1; // 학생을 담아 둘 수 있는 변수 선언. (Student형의 변수를 선언.)
        student1 = new Student(); // 객체 , 인스턴스 학생을 실제 메모리에 만듬. 만들고 나서 학생에 대한 정보를 student1 변수에 담아둠.
        // 참조값을 studnet1에 초기화.  student1 = x001; 이때 인스턴스를 생성하는거긴 하나 student1에는 인스턴스가 들어 있는게 아니라 주소 값이 들어가있는것.


        student1.name= "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age = 16;
        student2.grade = 80;


        System.out.println("이름:"+student1.name+" 나이:"+student1.age+" 성적:"+student1.grade);
        System.out.println("이름:"+student2.name+" 나이:"+student2.age+" 성적:"+student2.grade);

        System.out.println(student1);
        System.out.println(student2);






         */












    }
}
