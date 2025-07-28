package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        /*
        String name1 = "학생1";
        String name2 = "학생2";

        int age1= 15, age2 = 16;

        int score1 = 90, score2 = 80;

        System.out.println("이름: "+name1+" 나이: "+age1+" 성적: "+score1);
        System.out.println("이름: "+name2+" 나이: "+age2+" 성적: "+score2);

         */

        // 배열을 이용해서 해결
        String[] name= new String[]{"학생1","학생2"};
        int[] score= new int[]{90,80};
        int[] age = new int[]{15,16};

        for(int i=0; i<2; i++){
            System.out.println("이름: "+name[i]+" 나이: "+age[i]+" 성적: "+score[i]);
        }

        /*
        만약에 학생1,학생2,학생3,학생4가 있다고 할 때 점수도 1,2,3,4에 맞춰서 지정을 해줘야 한다.
        코드를 작성하다가 학생3의 정보를 지우고 싶어서 학생3을 지우고 점수도 학생3의 점수를 지워야 하는데 다른 학생의 점수를 지우면 에러가 발생한다.
        이럴때 클래스를 이용한다.
         */
    }
}

/*

String name1 = "학생1";
String name2 = "학생2";

int age1 = 15, age2 = 16;

System.out.println("이름: "+name1+" 나이: "+age1+" 성적: "+score1);
System.out.println("이름: "+name2+" 나이: "+age2+" 성적: "+score2);

// 배열을 이용해서 해결
String[] name = new String[]{"학생1","학생2"};
int[] score = new int[]{90,80};
int[] age = new int[]{15,16};

for(int i=0; i<2; i++){
     System.out.println("이름: "+name[i]+" 나이: "+age[i]+" 성적: "+score[i]);
}

 */
