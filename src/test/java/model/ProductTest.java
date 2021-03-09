package model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

class ProductTest {

  @Test
  void shouldPrintProductInfo() {
    // given
    Product product = new Product("Mleko", 2);

    // when
    String result = product.toString();

    // then
    assertThat(product.toString()).isEqualTo("Mleko - 2 zł");
  }
}
