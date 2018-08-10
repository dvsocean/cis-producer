package com.scc;

import static org.mockito.Mockito.when;

import com.producer.cisproducer.CisProducerApplication;
import com.producer.cisproducer.ProductController;
import com.producer.cisproducer.ProductService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CisProducerApplication.class)
public class ProductsBase {

  @InjectMocks
  private ProductController productController;

  @Mock
  private ProductService productService;

  @Before public void setup() {
    RestAssuredMockMvc.standaloneSetup(productController);
    when(productService.find(1).getName()).thenReturn("Mongoose");

    System.out.println("Returned product object: ");
  }

  @Test
  public void testOne(){

  }
}
