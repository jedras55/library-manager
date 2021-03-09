package model;

public class Order {
  private Product[] products;
  private OrderStatus orderStatus;

  public Order(Product[] products, OrderStatus orderStatus) {
    this.products = products;
    this.orderStatus = orderStatus;
  }
}
