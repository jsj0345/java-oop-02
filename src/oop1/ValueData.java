package oop1;

public class ValueData {
    int value;

    void add(){
        value++; // ValueObjectMain에서 주소를 받아서 add로 접근 여기서 value값은 자신의 클래스 안에 있는 멤버 변수를 의미함.
        System.out.println("숫자 증가 value="+value);
    }

    /*
    void add(){
        value++; // ValueObjectMain에서 주소를 받아서 add로 접근. 여기서 value값은 자신의 클래스 안에 있는 멤버 변수를 의미함.
        System.out.println("숫자 증가 value="+value);

    }
     */


    // 이 클래스에는 데이터인 value와 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의함.
}
