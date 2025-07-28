package com.helloshop.order;
import com.helloshop.product.Product;
import com.helloshop.user.User;

/*
여기서 핵심은 왼쪽에 패키지 계층 구조를 이룬다고 해도 서로 별개의 패키지이기 때문에..
쓰고싶은 패키지가 있으면 import 해줘야 한다.
 */

public class Order {
  User user;
  Product product;

  public Order(User user, Product product){
    this.user = user;
    this.product = product;

  }
}
