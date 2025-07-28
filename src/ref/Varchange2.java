package ref;

public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // 인스턴스 생성 및 주소 생성.
        dataA.value = 10;
        Data dataB = dataA; // dataA의 주소를 dataB로 초기화.

        // 참조값이 같은거지 dataA가 가리키는 인스턴스를 복사하는 것이 아님.

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);

        // 같은 참조값을 예상함.

        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30

        /*
        여기서 핵심은 Data dataB = dataA라고 했을 때 변수에 들어있는 값을 복사해서 아요한다는 점이다.
        그런데 그 값이 참조값이다.

        따라서, dataA와 dataB는 같은 참조값을 가지게 되고, 두 변수는 같은 객체 인스터스를 참조하게 된다.
         */

    }
}
