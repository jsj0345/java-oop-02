package oop1;

public class ValueDataMain {

    /*
    절차 지향적 프로그래밍 -> ValueData 클래스에 있는 데이터들에 관한 메서드들이 main 메서드에 다 들어있음.

     */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자="+valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++; // ValueObjectMain과는 다르게 ValueData 자기 자신의 클래스에 value가 있지 않고 기능도 분리되어있음.
        System.out.println("숫자 증가 value="+valueData.value);

    }

    /*
    public static void main(String[] args) {
         ValueData valueData = new ValueData();
         add(valueData);
         add(valueData);
         add(valueData);
         System.out.println("최종 숫자="+valueData.value);


    }

    static void add(ValueData valueData){
         valueData.value++;
         System.out.println("숫자 증가 value="+valueData.value);

    }

     */

}
