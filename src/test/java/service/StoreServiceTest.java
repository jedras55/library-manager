package service;

import static org.assertj.core.api.Assertions.assertThat;

import model.OrderStatus;
import model.Product;
import org.junit.jupiter.api.Test;

class StoreServiceTest {

  StoreService storeService = new StoreService();

  @Test
  void shoulFilterProductsByOrderStatus() {
    // given
    Product[] products =
        new Product[] {
          new Product(), new Product(), new Product(), new Product(), new Product(), new Product()
        };
    OrderStatus orderStatus = OrderStatus.values()[0];

    // when
    Product[] result = storeService.filterProductsByOrderStatus(products, orderStatus);

    // then
    assertThat(result).hasSize(0);
  }
}
