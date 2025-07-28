package final1;

public class FieldInit {
  static final int CONST_VALUE = 10;
  final int value = 10;

  // static final이 붙으면 변수명은 다 대문자로 쓰는 관례가 있음.

  /*
  public FieldInit(int value) {
    this.value = value; // 이미 초기값이 한번 할당 되었으므로 할당 불가.
  }
   */
}

/*
package final1;

public class FieldInit {
  static final int CONST_VALUE = 10;
  final int value = 10;

  // static final이 붙으면 변수명은 다 대문자로 쓰는 관례가 있음.

  public FieldInit(int value){
    this.value = value; // 이미 초기값이 한번 할당 되었으므로 할당 불가.

  }


 */
