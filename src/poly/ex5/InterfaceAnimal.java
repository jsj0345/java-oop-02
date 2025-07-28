package poly.ex5;

public interface InterfaceAnimal {
  void sound(); // public abstract가 이미 포함 됨.
  void move(); // public abstract가 이미 포함 됨.

  // Interface는 보통 여러 곳에서 사용하기 위해 만든다.
  // 그래서 Interface는 접근 제어자를 보통 public으로 쓴다.
}

/*
package poly.ex5;

public interface InterfaceAnimal {
  void sound(); // public abstract가 이미 포함 됨.
  void move(); // public abstract가 이미 포함 됨.

  // Interface는 보통 여러 곳에서 사용 하기 위해 만든다.
  // 그래서 Interface는 접근 제어자를 보통 public으로 쓴다.

 }
 */