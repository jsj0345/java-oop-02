package poly.practice.pay0;

public class PayService {

  public void processPay(String option, int amount) {
    boolean result;
    System.out.println("결제를 시도합니다: option="+ option +", amount=" + amount);

    if(option.equals("kakao")) {
      KakaoPay kakaoPay = new KakaoPay();
      result = kakaoPay.pay(amount);
    } else if (option.equals("naver")) {
      NaverPay naverPay = new NaverPay();
      result = naverPay.pay(amount);
    } else {
      System.out.println("결제 수단이 없습니다.");
      result = false;
    }

    if (result) {
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }

    /*
    이 코드의 문제점은 option이 늘어나면 날수록
    코드의 길이가 길어지고 인스턴스 생성 및 메서드 호출을 반복 해야한다.

    이 문제점을 어떻게 해결 하는게 좋을까? 코드의 길이를 줄여보자.
     */


  }
}
