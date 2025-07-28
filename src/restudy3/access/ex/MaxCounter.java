package restudy3.access.ex;

public class MaxCounter {
  private int count;
  private int max;

  MaxCounter(int count){
    this.max = count;
  }

  void increment() {
    if (count < max) {
      this.count++;
    } else {
      System.out.println("최대값을 초과할 수 없습니다.");
    }
  }

  int getCount(){
    return count;
  }
}
