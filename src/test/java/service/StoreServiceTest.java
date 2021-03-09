package service;

import static org.assertj.core.api.Assertions.assertThat;

import model.Order;
import model.OrderStatus;
import model.Product;
import org.junit.jupiter.api.Test;

class StoreServiceTest {

  StoreService storeService = new StoreService();

  @Test
  void shouldFilterProductsByOrderPaid() {
    // given
    Order[] orders =
        new Order[] {
          new Order(new Product[] {}, OrderStatus.NEW),
          new Order(new Product[] {}, OrderStatus.PAID),
          new Order(new Product[] {}, OrderStatus.PAID),
          new Order(new Product[] {}, OrderStatus.NEW),
          new Order(new Product[] {}, OrderStatus.SHIPPED),
          new Order(new Product[] {}, OrderStatus.NEW)
        };
    OrderStatus orderStatus = OrderStatus.PAID;

    // when
    Order[] result = storeService.filterOrdersByOrderStatus(orders, orderStatus);

    // then
    assertThat(result).hasSize(2);
  }

  @Test
  void shouldFilterProductsByOrderStatus() {
    // given
    Order[] orders =
        new Order[] {
          new Order(new Product[] {}, OrderStatus.NEW),
          new Order(new Product[] {}, OrderStatus.PAID),
          new Order(new Product[] {}, OrderStatus.PAID),
          new Order(new Product[] {}, OrderStatus.NEW),
          new Order(new Product[] {}, OrderStatus.SHIPPED),
          new Order(new Product[] {}, OrderStatus.NEW)
        };
    OrderStatus orderStatus = OrderStatus.SHIPPED;

    // when
    Order[] result = storeService.filterOrdersByOrderStatus(orders, orderStatus);

    // then
    assertThat(result).hasSize(1);
  }
}
