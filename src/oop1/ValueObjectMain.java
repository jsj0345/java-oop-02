package oop1;



public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();

        // ValueData valueData = x002;
        // valueData가 x002라는 주소를 받음.


        valueData.add(); // 주소에 있는 인스턴스 안에 있는 메서드에 접근.
        valueData.add(); // ValueDataMain과 다르게 자신의 데이터를 자신이 수정함. (ValueData를 참고)
        valueData.add();
        System.out.println("최종 숫자="+ valueData.value);
    }


}
